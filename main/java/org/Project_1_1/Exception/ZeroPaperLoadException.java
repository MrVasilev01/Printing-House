package org.Project_1_1.Exception;

public class ZeroPaperLoadException extends Exception {
    private double maxPaperLoad;

    public ZeroPaperLoadException(String message, double maxPaperLoad) {
        super(message);
        this.maxPaperLoad = maxPaperLoad;
    }

    @Override
    public String toString() {
        return "MaxPaperLoadException{" +
                "maxPaperLoad=" + maxPaperLoad +
                "} " + super.toString();
    }
}
