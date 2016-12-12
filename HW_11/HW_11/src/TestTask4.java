import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTask4 {

    // Тест метода numToString() задания 4
    @Test
    public void showNumTenAsString(){

        //given
        int a = 10;
        String expected = "ten";

        //when
        String actual = Main.numToString(10);

        //then
        assertEquals(expected,actual);
    }

    @Test
    public void showNumFourAsString(){

        //given
        int a = 4;
        String expected = "four";

        //when
        String actual = Main.numToString(4);

        //then
        assertEquals(expected,actual);
    }

    @Test
    public void showNumsevenAsString(){

        //given
        int a = 7;
        String expected = "seven";

        //when
        String actual = Main.numToString(7);

        //then
        assertEquals(expected,actual);
    }

    @Test
    public void showNumOneAsString(){

        //given
        int a = 1;
        String expected = "eleven";

        //when
        String actual = Main.numToString(1);

        //then
        assertEquals(expected,actual);
    }
}
