import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask2 {

    // тест метода mCard() задани 2

    @Test
    public void shouldRuternCardPikaSix(){
        //given
        int a = 1, b = 6;
        String expected = "6 Пика";

        //when
        String actual = Main.mCard(1,6);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRuternCardChervaKorol(){
        //given
        int a = 4, b = 13;
        String expected = "Король Черва";

        //when
        String actual = Main.mCard(4,13);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRuternCardBubnaefTen(){
        //given
        int a = 3, b = 10;
        String expected = "10 Бубна";

        //when
        String actual = Main.mCard(3,10);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRuternCardTrefSeven(){
        //given
        int a = 3, b = 7;
        String expected = "7 Треф";

        //when
        String actual = Main.mCard(3,7);

        //then
        assertEquals(expected, actual);

    }


}
