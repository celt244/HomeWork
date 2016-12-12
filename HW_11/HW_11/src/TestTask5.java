import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTask5 {

    // test method reversStr() of task 5

    @Test

    public void shouldReverstStringLevel(){

        //given
        String a = "Level";
        String expected = "leveL";

        //when
        String actual = Main.reversStr(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverstStringPleH(){

        //given
        String a = "eM pleH";
        String expected = "Help Me";

        //when
        String actual = Main.reversStr(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverstStringOassis(){

        //given
        String a = "Oassis";
        String expected = "sissaO";

        //when
        String actual = Main.reversStr(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverstStringTresh(){

        //given
        String a = "Tresh";
        String expected = "Super tresh";

        //when
        String actual = Main.reversStr(a);

        //then
        assertEquals(expected, actual);
    }
}
