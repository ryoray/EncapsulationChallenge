package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(40,true);

        printer.printPage(79,300,true);
        printer.fillToner(-20);
    }
}
