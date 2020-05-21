package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public void setPagePrinted(int pagePrinted) {
        this.pagePrinted = pagePrinted;
    }

    //    private int tonerLevel;
//    private int tonerUsage;
//    private boolean isDuplex;
//
//    public Printer(int tonerLevel, boolean isDuplex) {
//        this.tonerLevel = tonerLevel;
//        this.isDuplex = true;
//    }
//
//    public void fillToner(int addToner) {
//        if (addToner < 0) {
//            System.out.println("You can't input negative amount");
//        } else {
//            if (this.getTonerLevel() < 50) {
//                if (this.getTonerLevel() + addToner > 100) {
//                    System.out.println("You add too much toner. You just need to add " +
//                            (100 - getTonerLevel()) + "% toner");
//                } else {
//                    this.tonerLevel += addToner;
//                    System.out.println("You add " + addToner + "% toner. Current toner " +
//                            "level is now " + this.getTonerLevel() + " %");
//                }
//            } else {
//                System.out.println("You still have enough toner.");
//            }
//        }
//    }
//
//    public int printPage(int tonerLevel, int pages, boolean isDuplex) {
//        this.isDuplex = isDuplex;
//        if (this.isDuplex) {
//            tonerUsage = pages / 10;
//        } else {
//            tonerUsage = pages / 20;
//        }
//        this.tonerLevel = tonerLevel - tonerUsage;
//        System.out.println("You have printed " + pages + " pages. You use " + getTonerUsage() +
//                "% of toner level");
//        return this.tonerLevel;
//    }
//
//
//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
//    public int getTonerUsage() {
//        return tonerUsage;
//    }

}
