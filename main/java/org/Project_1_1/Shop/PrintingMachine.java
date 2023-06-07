package org.Project_1_1.Shop;

import org.Project_1_1.Exception.ZeroPaperLoadException;
import org.Project_1_1.Paper.PaperType;

import java.util.ArrayList;
import java.util.List;

public class PrintingMachine {
    private int maxPaperLoad;
    private int pagesPerMinute;
    private boolean isColor;
    private List<PaperType> paperTypes;

    public PrintingMachine(int maxPaperLoad, int pagesPerMinute, boolean isColor) {
        this.maxPaperLoad = maxPaperLoad;
        this.pagesPerMinute = pagesPerMinute;
        this.isColor = isColor;
        this.paperTypes = new ArrayList<>();
    }

    public int getMaxPaperLoad() {
        return maxPaperLoad;
    }

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    public boolean isColor() {
        return isColor;
    }

    public boolean loadMachine(PaperType paperType) {
        return this.paperTypes.add(paperType);
    }

    public boolean printedPaper(PaperType paperType) throws ZeroPaperLoadException {
        if (paperTypes.size() == 0) {
            throw new ZeroPaperLoadException("There is no paper loaded in printing machine, max number of papers is: ", maxPaperLoad);
        } else {
            return this.paperTypes.remove(paperType);
        }
    }

    public void print(PaperType paperType) throws ZeroPaperLoadException {
        if (paperTypes.size() == 0) {
            throw new ZeroPaperLoadException("There is no paper loaded in printing machine, max number of papers is: ", maxPaperLoad);
        }
        System.out.println("Printing " + paperTypes.size() + " pages at " + pagesPerMinute + " pages per minute...");
        this.paperTypes.remove(paperType);
    }

    @Override
    public String toString() {
        return "PrintingMachine{maxPaperLoad="
                + maxPaperLoad + ", pagesPerMinute="
                + pagesPerMinute + ", isColor="
                + isColor + "}";
    }

}
