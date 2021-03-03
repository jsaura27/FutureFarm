package processor;

import resourcesClass.CSVReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ChemicalProvider {

    public static int priceChecker(CropData farm, ChemicalData chemicalProvider){

        //Simple method to check the price by Hectare
        int size = farm.length * farm.width;
        int price = chemicalProvider.getPpl();
        int totalPrice = (size/10000)*price;

        return totalPrice;
    }
    public static void cropChemicalChecker(List<CropData> farms, List<ChemicalData> chemicalProvider, List<Output> outputList) throws IOException {


        File file = new File("resources/output.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        //Double loop to check first if the crop fits the chemical
        //And second if the time fits the needs of the chemical on that field
        for(int i = 0; i<farms.size();i++){
            for(int j = 0; j<chemicalProvider.size();j++){
                if(farms.get(i).getCrop().equalsIgnoreCase(chemicalProvider.get(j).getCropUsage())){
                    LocalDate date = farms.get(i).getLastSprayed();
                    // It is one week before the next spray at least when you need the next one
                    int daysNextSpray = (chemicalProvider.get(j).getWaf()-1) * 7;
                    LocalDate minNextDate = date.plusDays(daysNextSpray);
                    if(minNextDate.isBefore(LocalDate.now())){
                        Output output = new Output();
                        output.setFarmName(farms.get(i).getName());
                        output.setChemicalName(chemicalProvider.get(j).getName());
                        writer.write("The farm " + farms.get(i).getName() + " needs a new spray of " + chemicalProvider.get(j).getName() + "\n");
                        writer.flush();
                        System.out.println("The farm " + farms.get(i).getName() + " needs a new spray of " + chemicalProvider.get(j).getName()+ "\n");

                        int price = priceChecker(farms.get(i),chemicalProvider.get(j));
                        output.setPrice(price);
                        writer.write("For a price of = " + price+ "\n");
                        writer.flush();
                        System.out.println("For a price of = " + price);

                    }
                }
            }
        }

        writer.close();

    }

    public static void main(String[] args) throws IOException {
        List<CropData> listFarms = CSVReader.farmReader();
        List<ChemicalData> listChemicalProviders =CSVReader.chemicalReader();
        List<Output> outputList = new ArrayList<>();
        cropChemicalChecker(listFarms,listChemicalProviders,outputList);


    }

}
