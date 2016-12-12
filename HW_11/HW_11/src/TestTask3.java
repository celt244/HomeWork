import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask3 {

    // тест метода dayYear() задани 3

    @Test
    public void show100Day(){

        //given
        int a = 100, b = 1;
        String expected = "Tuesday";

        //when
        String actual = Main.dayYear(100, 1);

        //then
        assertEquals(expected, actual);
    }
    @Test
    public void show202Day(){

        //given
        int a = 202, b = 5;
        String expected = "Wednesday";

        //when
        String actual = Main.dayYear(202, 5);

        //then
        assertEquals(expected, actual);
    }
    @Test
    public void show303Day(){

        //given
        int a = 303, b = 3;
        String expected = "Thursday";

        //when
        String actual = Main.dayYear(303, 3);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void show129Day(){

        //given
        int a = 129, b = 6;
        String expected = "Thursday";

        //when
        String actual = Main.dayYear(129, 6);

        //then
        assertEquals(expected, actual);
            }
}
