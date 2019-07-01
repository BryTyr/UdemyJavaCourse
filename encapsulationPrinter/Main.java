package encapsulationPrinter;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(70,false);
        Printer duplexPrinter = new Printer(80,true);

        printer.PrintPages(5);
        duplexPrinter.PrintPages(5);
        duplexPrinter.fillUpToner(40);

    }
}
