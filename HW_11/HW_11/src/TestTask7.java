import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTask7 {

    // Test method strArr() of task 7

    @Test
    public void showElemArrayMoreSixLiter(){

        //given
        int a = 6;
        String expected = "Меркурий, Намибия, Андромена, ";

        //when
        String actual = Main.strArr(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void showElemArrayMoreEightLiter(){

        //given
        int a = 8;
        String expected = "Андромена, ";

        //when
        String actual = Main.strArr(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void showElemArrayMoreSevenLiter(){

        //given
        int a = 7;
        String expected = "Меркурий, Андромена, ";

        //when
        String actual = Main.strArr(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void showElemArrayMoreFiveLiter(){

        //given
        int a = 5;
        String expected = "Солнце, Земля, Меркурий, Андромена, ";

        //when
        String actual = Main.strArr(a);

        //then
        assertEquals(expected, actual);
    }
}
