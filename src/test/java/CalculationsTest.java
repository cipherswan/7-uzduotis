import org.junit.Assert;
import org.junit.Test;

import javax.xml.ws.RequestWrapper;

public class CalculationsTest {

    Calculations calc = new Calculations();

    //add

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiSkaiciaiSudetiYraNullIsmetamasException(){
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

    //subtract

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiSkaiciaiAtimtiYraNullIsmetamasException(){
        calc.subtract("");
    }

    @Test
    public final void kaiAtimamiSkaiciaiGaunamasAtskymas(){
        Assert.assertEquals(5-3, calc.subtract("5,3"));
    }

    @Test
    public final void kaiAtimamiSkaiciaiTikimasiAtskyrimasKableliais(){
        Assert.assertEquals(7-7, calc.subtract("7,7"));
    }

    @Test
    public final void kaiAtimamasSkaiciusVienasJisIrIsvedamas(){
        Assert.assertEquals(1, calc.subtract("1"));
    }


    //multiply

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiSkaiciaiSudaugintiYraNullIsmetamasException(){
        calc.multiply("");
    }

    @Test
    public final void kaiDauginamiSkaiciaiGaunamasAtskymas(){
        Assert.assertEquals(2*2*3, calc.multiply("2,2,3"));
    }

    @Test
    public final void kaiSudauginamiSkaiciaiTikimasiAtskyrimasKableliais(){
        Assert.assertEquals(7*7, calc.multiply("7,7"));
    }

    @Test
    public final void kaiSudauginamasSkaiciusVienasJisIrIsvedamas(){
        Assert.assertEquals(5, calc.multiply("5"));
    }






}
