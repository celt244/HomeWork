import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask6 {

    // Test method valEmail() of Task 6

    @Test
    public void chekEmailArthur(){

        //given
        String a = "arthur@gmail.com";
        String expected = "email - валидный";

        //when
        String actual = Main.valEmail(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void chekEmailNirvana(){

        //given
        String a = "nivana@.com";
        String expected = "domain - невалидный";

        //when
        String actual = Main.valEmail(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void chekEmailOffspring(){

        //given
        String a = "Offspring@gmail.comcomcom";
        String expected = "zone - невалидный";

        //when
        String actual = Main.valEmail(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void chekEmailSoad(){

        //given
        String a = "S@gmail.com";
        String expected = "login - невалидный";

        //when
        String actual = Main.valEmail(a);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void chekEmailMuse(){

        //given
        String a = "muse@gmail.com";
        String expected = "login - невалидный";

        //when
        String actual = Main.valEmail(a);

        //then
        assertEquals(expected, actual);
    }
}
