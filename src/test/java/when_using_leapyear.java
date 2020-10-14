import org.junit.jupiter.api.Test;
import static no.Thomas.LeapYear.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class when_using_leapyear {

    @Test
    public void year_2000_is_a_leapyear() {
        assertTrue(isLeapYear(2000));
    }
    @Test
    public void year_1700_is_not_a_leapyear() {
        assertFalse(isLeapYear(1700));
    }
    @Test
    public void year_2100_is_not_a_leapyear() {
        assertFalse(isLeapYear(2100));
    }
    @Test
    public void year_2004_is_a_leapyear() {
        assertTrue(isLeapYear(2004));
    }

}
