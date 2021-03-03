package resourcesClass;


import processor.ChemicalData;
import processor.CropData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CSVReader {

    static private final String FARM_REFERENCE_FILE = "resources/farmData.csv";
    static private final String CHEMICAL_REFERENCE_FILE = "resources/chemicalsData.csv";
    static private final String SEPARATOR = ",";

    static public List<CropData> farmReader() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(FARM_REFERENCE_FILE));
        String row;
        List<CropData> dataList = new ArrayList<>();

        while ((row = csvReader.readLine()) != null){

            CropData data = new CropData();
            String[] datas = row.split(SEPARATOR);

            data.setName(datas[0]);

            String[] widthString = datas[1].split(" ");
            data.setWidth(Integer.parseInt(widthString[0]));

            String[] lengthString = datas[2].split(" ");
            data.setLength(Integer.parseInt(lengthString[0]));
            data.setCrop(datas[3]);

            String[] dateString = datas[4].split(" ");
            int day = Integer.parseInt(dateString[0].replaceAll("[^\\d]", ""));
            String month = dateString[1];
            int monthNumber = Months.monthComparator(month);
            LocalDate date = LocalDate.of(2021, monthNumber, day);
            data.setLastSprayed(date);

            dataList.add(data);

        }
        return dataList;

    }

    static public List<ChemicalData> chemicalReader() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(CHEMICAL_REFERENCE_FILE));
        String row;
        List<ChemicalData> dataList = new ArrayList<>();

        while ((row = csvReader.readLine()) != null){

            ChemicalData data = new ChemicalData();
            String[] datas = row.split(SEPARATOR);

            data.setName(datas[0]);

            data.setCropUsage(datas[1]);

            int price = Integer.parseInt(datas[2].replaceAll("[^\\d]", ""));
            data.setPpl(price);

            String[] frecuency = datas[3].split(" ");
            int weeks = Integer.parseInt(frecuency[0]);

            data.setWaf(weeks);

            dataList.add(data);

        }
        return dataList;
    }

}
