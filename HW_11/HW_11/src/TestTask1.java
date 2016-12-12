import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTask1 {

// Тест метода dayMouth() Задания 1

    @Test

    public void shouldShowDayOfMonthInYear2016(){

        // given
        int a = 12, b = 2016;
        int expected = 31;

        //when
        int actual = Main.dayMouth(a,b);

        //then
        assertEquals(expected, actual);
    }

    @Test

    public void shouldShowDayOfMonthInYear2015(){

        // given
        int a = 4, b = 2015;
        int expected = 30;

        //when
        int actual = Main.dayMouth(a,b);

        //then
        assertEquals(expected, actual);
    }
    @Test

    public void shouldShowDayOfMonthInYear2000(){

        // given
        int a = 2, b = 2000;
        int expected = 29;

        //when
        int actual = Main.dayMouth(a,b);

        //then
        assertEquals(expected, actual);
    }

    @Test

    public void shouldShowDayOfMonthInYear2004(){

        // given
        int a = 2, b = 2004;
        int expected = 28;

        //when
        int actual = Main.dayMouth(a,b);

        //then
        assertEquals(expected, actual);
    }

}

