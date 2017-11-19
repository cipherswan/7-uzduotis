import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private Person person = new Person();

    //First name

    @Test (expected = RuntimeException.class)
    public final void kaiRasomasVardasYraNullIsmetamasException() {
        person.addFirstName("");
    }

    @Test
    public final void kaiRasomasVardasTeisingaiViskasGerai() {
        person.addFirstName("Petras");
    }

    @Test
    public final void kaiRasomasVardasYraNurodomasVardoIlgis() {
        String vardas = person.addFirstName("Jonas");
        Assert.assertEquals(5, person.checkCharacterLength(vardas));
    }

    @Test
    public final void kaiRasomasVardasYraTikrinamaArNePerIlgas() {
        person.addFirstName("Jonas");
        boolean isTooLong = person.isTooLong;
        Assert.assertEquals(false, isTooLong);
    }


    //Last name

    @Test (expected = RuntimeException.class)
    public final void kaiRasomaPavardeYraNullIsmetamasException() {
        person.addLastName("");
    }

    @Test
    public final void kaiRasomaPavardeTeisingaiViskasGerai() {
        person.addLastName("Jonaitis");
    }

    @Test
    public final void kaiRasomaPavardeYraNurodomasPavardesIlgis() {
        String pavarde = person.addLastName("Jonaitis");
        Assert.assertEquals(8, person.checkCharacterLength(pavarde));
    }

    @Test
    public final void kaiRasomaPavardeYraTikrinamaArNePerIlga() {
        person.addFirstName("Jonaitis");
        boolean isTooLong = person.isTooLong;
        Assert.assertEquals(false, isTooLong);
    }


    //Age

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiMetaiYraNeigiamiIsmetamasException() {
        person.addAge(-10);
    }

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiMetaiYraNulisIsmetamasException() {
        person.addAge(0);
    }

    @Test
    public final void kaiRasomiMetaiYraMaziau21ViskasGerai() {
        person.addAge(20);
        boolean ageValid = person.ageValid;
        Assert.assertEquals(false, ageValid);
    }

    @Test
    public final void kaiRasomasAmziusYraDaugiau20ViskasGerai() {
        person.addAge(21);
        boolean ageValid = person.ageValid;
        Assert.assertEquals(true, ageValid);
    }

    @Test
    public final void kaiAmziusDaugiau120(){
        person.addAge(155);
        boolean ageValid = person.ageValid;
        Assert.assertEquals(false, ageValid);
    }

    @Test
    public final void kaiRasomiMetaiViskasGerai() {
        person.addAge(27);
    }

    //Location

    @Test (expected = RuntimeException.class)
    public final void kaiRasomaVietaYraNulisIsmetamasException() {
        person.addLocation("");
    }

    @Test
    public final void kaiRasomaVietaYraNurodomasVietosIlgis() {
        String location = person.addFirstName("Vilnius");
        Assert.assertEquals(7, person.checkCharacterLength(location));
    }

    @Test
    public final void kaiRasomaVietaTikrinamaArIsDidzRaides() {
        person.addLocation("Vilnius");
        boolean locationValid = person.locationValid;
        Assert.assertEquals(true, locationValid);
    }

    @Test
    public final void kaiRasomaVietaTeisingaiViskasGerai() {
        person.addFirstName("Vilnius");
    }


    //Email

    @Test (expected = RuntimeException.class)
    public final void kaiRasomasEmailAddressYraNulisIsmetamasException() {
        person.addEmail("");
    }

    @Test
    public final void kaiRasomasEmailYraNurodomasEmailIlgis() {
        String email = person.addFirstName("jonas@gmail.com");
        Assert.assertEquals(15, person.checkCharacterLength(email));
    }

    @Test
    public final void kaiRasomasEmailYraTikrinamaArYraAtSimbolis() {
        person.addEmail("s@s.com");
        boolean at = person.at;
        Assert.assertEquals(true, at);
    }

    @Test
    public final void kaiRasomasEmailYraTikrinamaArYraDomenas() {
        person.addEmail("s@s.com");
        boolean at = person.at;
        Assert.assertEquals(true, at);
    }

    @Test
    public final void kaiRasomasEmailTeisingaiViskasGerai() {
        person.addEmail("jonas@gmail.com");
    }

    //Phone number

    @Test (expected = RuntimeException.class)
    public final void kaiRasomasTelefonoNumerisYraNulisIsmetamasException() {
        person.addPhoneNumber("");
    }

    @Test
    public final void kaiRasomasTelNumerisYraNurodomasJoIlgis() {
        String number = person.addPhoneNumber("864789125");
        Assert.assertEquals(9, person.checkCharacterLength(number));
    }

    @Test
    public final void kaiRasomasTelNumerisTikrinamaArTeisingasIlgis() {
        person.addPhoneNumber("11225478");
        boolean numberLengthValid = person.phNumberLength;
        Assert.assertEquals(true, numberLengthValid);
    }

    @Test
    public final void kaiRasomasTelNumerisTikrinamaArIsLietuvos() {
        person.addPhoneNumber("65554789");
        boolean numberValid = person.phNumberValid;
        Assert.assertEquals(true, numberValid);
    }

    @Test
    public final void kaiRasomasTelNumerisTeisingaiViskasGerai() {
        person.addFirstName("68456789");
    }

    //Password

    @Test (expected = RuntimeException.class)
    public final void kaiRasomasSlaptazodisYraNullIsmetamasException() {
        person.addPassword("");
    }

    @Test
    public final void kaiRasomasSlaptazodisTeisingaiViskasGerai() {
        person.addPassword("slaptazodis");
    }

    @Test
    public final void kaiRasomasSlaptazodisYraNurodomasJoIlgis() {
        String psw = person.addPassword("aaaaaaa");
        Assert.assertEquals(7, person.checkCharacterLength(psw));
    }

    @Test
    public final void kaiRasomasSlaptazodisYraTikrinamaArNePerTrumpas() {
        person.addPassword("aaaaaa");
        boolean isTooShort = person.passTooShort;
        Assert.assertEquals(false, isTooShort);
    }
}

//32

