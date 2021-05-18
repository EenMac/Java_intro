import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 10, 100);
    }
    @Test
    public void pagesLeft(){
        assertEquals(50, printer.pagesLeft());
    };
    @Test
    public void canPrint(){
        Printer newPrinter = new Printer(20, 10, 100);
        assertEquals("you have 10 pages and 10 copies.", newPrinter.print(20, 10));
    }
    @Test
    public void wontPrint(){
        Printer newPrinter = new Printer(5, 10, 100);
        assertEquals("not enough pages", newPrinter.print(2, 12));
    }
    @Test
    public void reduceToner(){
        assertEquals(49, printer.toner(50, 100));
    }
}
