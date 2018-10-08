import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000, 500);
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
    public void cannotPrintNotEnoughTonerVolume(){
        printer.print(10,60);
        assertEquals(500, printer.getTonerVolume());    }

    @Test
    public void canTopUpPaper(){

        printer.topUpPaper(500);
        //printer.print(60,10);
        assertEquals(1500, printer.getNumberOfSheetsOfPaper());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(500, printer.getTonerVolume());
    }

}
