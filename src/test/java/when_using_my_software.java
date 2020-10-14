import no.Thomas.MySoftware.MySoftware;
import org.junit.jupiter.api.*;

public class when_using_my_software {

    @Test()
    public void i_get_a_nice_statement() {
       MySoftware sut = new MySoftware();
       String actual = sut.message();
       Assertions.assertEquals("Hello!", actual);
    }
}
