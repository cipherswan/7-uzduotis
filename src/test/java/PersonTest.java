import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private Person person = new Person();

    //First name

    @Test (expected = RuntimeException.class)
    public final void kaiRasomasVardasYraNullIsmetamasException() {
        person.addFirstName("");
    }


    //Last name

    @Test (expected = RuntimeException.class)
    public final void kaiRasomaPavardeYraNullIsmetamasException() {
        person.addLastName("");
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
    public final void kaiRasomasLocationYraNulisIsmetamasException() {
        person.addLocation("");
    }


    //Email

    @Test (expected = RuntimeException.class)
    public final void kaiRasomasEmailAddressYraNulisIsmetamasException() {
        person.addEmail("");
    }

}

