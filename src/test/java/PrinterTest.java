import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000);
    }

    @Test
    public void hasPaper(){
        assertEquals(1000, printer.getNumberOfSheetsOfPaper());
    }

    @Test
    public void canPrint(){
        assertEquals(900, printer.print(10,10));
    }

    @Test
    public void cannotPrint(){
        assertEquals(1000, printer.print(100,100));
    }

    @Test
    public void canTopUpPaper(){
        printer.print(10,50);
        printer.topUpPaper(600);
        assertEquals(1100, printer.getNumberOfSheetsOfPaper());
    }

}
