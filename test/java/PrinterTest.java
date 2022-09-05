import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){printer = new Printer(20, 30);}

    @Test
    public void CheckPaperLeft(){
        assertEquals(20,printer.checkPaperLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(30, printer.checkTonerLeft());
    }

    @Test
    public void willPrintWithEnoughPaper(){
        assertEquals(true, printer.willPrint(10));
    }

    @Test
    public void willNotPrint(){
        assertEquals(false, printer.willPrint(21));
    }

    @Test
    public void willUsePaperAsItPrints(){
        printer.print(10);
        assertEquals(10, printer.checkPaperLeft());
    }

    @Test
    public void usedUpToner(){
        printer.print(10);
        assertEquals(20, printer.checkTonerLeft());
    }


}
