package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("Initial page count= " + printer.getPagePrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total of page count = " + printer.getPagePrinted() );

        pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total of page count = " + printer.getPagePrinted() );

        printer.setPagePrinted(0);

        Printer printer1 = new Printer(50,true);
        System.out.println("Initial page count= " + printer.getPagePrinted());

        pagesPrinted = printer1.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total of page count = " + printer1.getPagePrinted() );

        pagesPrinted = printer1.printPages(10);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total of page count = " + printer1.getPagePrinted() );

//        Printer printer = new Printer(40,true);
//
//        printer.printPage(79,600,false);
//        printer.fillToner(20);
    }
}
