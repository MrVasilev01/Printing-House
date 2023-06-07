package org.Project_1_1.Shop;

import org.Project_1_1.Paper.PaperSize;
import org.Project_1_1.Paper.PaperType;

public class Edition {
    private String type;
    private String title;
    private int number;
    private PaperType paperType;
    private PaperSize paperSize;
    private int numberOfSheets;

    public Edition(String type, String title, int number, PaperType paperType, PaperSize paperSize, int numberOfSheets) {
        this.type = type;
        this.title = title;
        this.number = number;
        this.paperType = paperType;
        this.paperSize = paperSize;
        this.numberOfSheets = numberOfSheets;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public PaperSize getPaperSize() {
        return paperSize;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double paperCosts() {
        if(numberOfSheets <= 0){
            return 1 * paperType.getPrice(paperSize);
        }
        return numberOfSheets * paperType.getPrice(paperSize);
    }

    @Override
    public String toString() {
        return "Edition{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", number=" + number +
                ", paperType=" + paperType +
                ", paperSize=" + paperSize +
                ", numberOfSheets=" + numberOfSheets +
                '}';
    }
}
