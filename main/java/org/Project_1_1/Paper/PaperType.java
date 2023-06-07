package org.Project_1_1.Paper;

public enum PaperType {
    REGULAR,
    GLOSSY,
    NEWSPAPER;

    public double getPrice(PaperSize paperSize) {
        switch (this) {
            case REGULAR:
                switch (paperSize) {
                    case A1:
                        return 0.5;
                    case A2:
                        return 0.25;
                    case A3:
                        return 0.125;
                    case A4:
                        return 0.0625;
                    case A5:
                        return 0.03125;
                    default:
                        throw new IllegalArgumentException("Invalid paper size: " + paperSize);
                }
            case GLOSSY:
                switch (paperSize) {
                    case A1:
                        return 0.75;
                    case A2:
                        return 0.375;
                    case A3:
                        return 0.1875;
                    case A4:
                        return 0.09375;
                    case A5:
                        return 0.046875;
                    default:
                        throw new IllegalArgumentException("Invalid paper size: " + paperSize);
                }
            case NEWSPAPER:
                switch (paperSize) {
                    case A1:
                        return 0.25;
                    case A2:
                        return 0.125;
                    case A3:
                        return 0.0625;
                    case A4:
                        return 0.03125;
                    case A5:
                        return 0.015625;
                    default:
                        throw new IllegalArgumentException("Invalid paper size: " + paperSize);
                }
            default:
                throw new IllegalArgumentException("Invalid paper type: " + this);
        }
    }
}
