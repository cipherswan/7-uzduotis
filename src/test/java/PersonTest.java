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
    public final void kaiRasomasVardasYraNurodomasVardoIlgis() {
        String vardas = person.addFirstName("Jonas");
        Assert.assertEquals(5, person.checkCharacterLength(vardas));
    }

    @Test
    public final void kaiRasomasVardasYraTikrinamaArNePerIlgas() {
        person.addFirstName("Jonas");
        boolean expected = false;
        boolean isTooLong = person.isTooLong;
        Assert.assertEquals(expected, isTooLong);
    }


    //Last name

    @Test (expected = RuntimeException.class)
    public final void kaiRasomaPavardeYraNullIsmetamasException() {
        person.addLastName("");
    }

    @Test
    public final void kaiRasomaPavardeYraNurodomasPavardesIlgis() {
        String pavarde = person.addLastName("Jonaitis");
        Assert.assertEquals(8, person.checkCharacterLength(pavarde));
    }

    @Test
    public final void kaiRasomaPavardeYraTikrinamaArNePerIlga() {
        person.addFirstName("Jonaitis");
        boolean expected = false;
        boolean isTooLong = person.isTooLong;
        Assert.assertEquals(expected, isTooLong);
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
        boolean expected = false;
        Assert.assertEquals(expected, ageValid);
    }

    @Test
    public final void kaiRasomasAmziusYraDaugiau20ViskasGerai() {
        person.addAge(21);
        boolean ageValid = person.ageValid;
        boolean expected = true;
        Assert.assertEquals(expected, ageValid);
    }

    @Test
    public final void kaiAmziusDaugiau120(){
        person.addAge(155);
        boolean ageValid = person.ageValid;
        boolean expected = false;
        Assert.assertEquals(expected, ageValid);
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
        boolean expected = true;
        boolean locationValid = person.locationValid;
        Assert.assertEquals(expected, locationValid);
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
        boolean expected = true;
        Assert.assertEquals(expected, at);
    }

    @Test
    public final void kaiRasomasEmailYraTikrinamaArYraDomenas() {
        person.addEmail("s@s.com");
        boolean at = person.at;
        boolean expected = true;
        Assert.assertEquals(expected, at);
    }

}

