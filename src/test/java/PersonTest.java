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


    //Age

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiMetaiYraNeigiamiIsmetamasException() {
        person.addAge(-5);
    }

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiMetaiYraNulisIsmetamasException() {
        person.addAge(0);
    }

    @Test (expected = RuntimeException.class)
    public final void kaiRasomiMetaiYraMaziau21ViskasGerai() {
        person.addAge(20);
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

}

