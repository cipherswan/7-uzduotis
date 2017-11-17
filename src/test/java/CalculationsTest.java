import org.junit.Assert;
import org.junit.Test;

import javax.xml.ws.RequestWrapper;

public class CalculationsTest {

    Calculations calc = new Calculations();

    //add

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiSkaiciaiYraNullIsmetamasException(){
        calc.add("");
    }

    @Test
    public final void kaiSudedamiSkaiciaiGaunamasAtskymas(){
        Assert.assertEquals(1+2+3, calc.add("1,2,3"));
    }

    @Test
    public final void kaiSudedamiSkaiciaiTikimasiAtskyrimasKableliais(){
        Assert.assertEquals(7+7+7, calc.add("7,7,7"));
    }

    @Test
    public final void kaiSudedamasSkaiciusVienasJisIrIsvedamas(){
        Assert.assertEquals(1, calc.add("1"));
    }



}
