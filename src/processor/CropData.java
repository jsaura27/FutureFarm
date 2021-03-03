package processor;

import java.time.LocalDate;

public class CropData {

    public String name;
    public int width;
    public int length;
    public String crop;
    public LocalDate lastSprayed;

    public CropData(String name, int width, int length, String crop, LocalDate lastSprayed) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.crop = crop;
        this.lastSprayed = lastSprayed;
    }

    public CropData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public LocalDate getLastSprayed() {
        return lastSprayed;
    }

    public void setLastSprayed(LocalDate lastSprayed) {
        this.lastSprayed = lastSprayed;
    }
}
