import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void is_year_which_is_dividable_by_4_but_not_100_a_leap_year(){
        int year = 4;
        assertTrue(LeapYear.isLeapYear(year));
    }
    @Test
    void is_year_which_is_dividable_by_400_a_leap_year(){
        int year = 400;
        assertTrue(LeapYear.isLeapYear(year));
    }

    @Test
    void is_year_which_is_not_dividable_by_4_not_a_leap_year(){
        int year = 1;
        assertFalse(LeapYear.isLeapYear(year));
    }
    @Test
    void is_year_which_is_dividable_by_100_but_not_400_not_a_leap_year(){
        int year = 100;
        assertFalse(LeapYear.isLeapYear(year));
    }
}