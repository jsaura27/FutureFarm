package processor;

public class ChemicalData {

    public String name;
    public String cropUsage;
    public int ppl; //price per litre
    public int waf; //weekApplicationFrequency

    public ChemicalData(String name, String cropUsage, int ppl, int waf) {
        this.name = name;
        this.cropUsage = cropUsage;
        this.ppl = ppl;
        this.waf = waf;
    }

    public ChemicalData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCropUsage() {
        return cropUsage;
    }

    public void setCropUsage(String cropUsage) {
        this.cropUsage = cropUsage;
    }

    public int getPpl() {
        return ppl;
    }

    public void setPpl(int ppl) {
        this.ppl = ppl;
    }

    public int getWaf() {
        return waf;
    }

    public void setWaf(int waf) {
        this.waf = waf;
    }
}
