public class Main extends Object {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getpagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job pages: %d, Printer Total: %d%n",pagesPrinted,printer.getpagesPrinted());
    
        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job pages: %d, Printer Total: %d%n",pagesPrinted,printer.getpagesPrinted());
    }   
}

