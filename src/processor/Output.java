package processor;

public class Output {

    public String farmName;
    public String chemicalName;
    public int price;

    public Output() {
    }

    public Output(String farmName, String chemicalName, int price) {
        this.farmName = farmName;
        this.chemicalName = chemicalName;
        this.price = price;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
