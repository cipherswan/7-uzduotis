import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

    private Calculations calc = new Calculations();

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
        Assert.assertEquals(10-7, calc.subtract("10,7"));
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

    //division

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiSkaiciaiDalintiYraNullIsmetamasException(){
        calc.divide("");
    }

    @Test
    public final void kaiDalinamiSkaiciaiGaunamasAtskymas(){
        Assert.assertEquals(12/6, calc.divide("12,6"));
    }

    @Test
    public final void kaiDalinysYraNulisGaunamasNulis(){
        Assert.assertEquals(0/6, calc.divide("0,6"));
    }

    @Test
    public final void kaiDalinamiSkaiciaiTikimasiAtskyrimasKableliais(){
        Assert.assertEquals(10/5, calc.divide("10,5"));
    }

    @Test (expected = RuntimeException.class)
    public final void kaiDalinamasSkaiciusVienasIsmetamasException(){
        calc.divide("2");
    }

    @Test (expected = IllegalArgumentException.class)
    public final void kaiDalinamaIsNulioIsmetamasException() {
        calc.divide("4,0");
    }

}

//18
