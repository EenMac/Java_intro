public class Runner {
    public static void main(String[] args){
        Printer printer = new Printer(10, 10, 100);
        System.out.println(printer.pagesLeft());
        System.out.println(printer.print(10, 100));
        System.out.println(printer.toner(20, 100));

    }
}
