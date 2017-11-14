import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person person = new Person();

    @Test
    public final void kaiRasomiMetaiRaidemisIsmetamasException() {
    }

    @Test
    public final void kaiRasomiMetaiMaziauNeguNulisIsmetamasException() {
        RuntimeException exception = null;
        try {
            person.addAge();
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNotNull("Exception was not thrown", exception);
        Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
    }
}

