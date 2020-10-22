import org.junit.jupiter.api.Test;
import static no.Thomas.LeapYear.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class when_using_leapyear {

    @Test
    public void leap_years_are_divisible_by_four_but_not_by_100() {
        assertFalse(isLeapYear(100));
    }
    @Test
    public void leap_years_are_divisible_by_fourhundred() {
        assertTrue(isLeapYear(800));
    }
    @Test
    public void nonleap_years_are_not_divisible_by_four() {
        assertTrue(isLeapYear(4));
    }
    @Test
    public void nonleap_years_are_divisible_by_hundred_but_not_400() {
        assertFalse(isLeapYear(1700));
    }

}
