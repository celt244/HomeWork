import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

public class AListTest {

    AList list;

    @Before
    public void setUp() {
        list = new AList();
    }

    @Test
    public void shouldCheckThatListEmpty() throws Exception {
        //given
        int expected = 0;

        //when
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldAddElementAndReturnSizeOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(5);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldAddElementsAndReturnSizeTwo() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(5);
        list.add(6);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddMoreElementsThanInitialSizeWithoutTroubles() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test
    public void shouldReturnLastAddedElement() {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int lastAddedIndex = list.size() - 1;
        int actual = list.get(lastAddedIndex);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetZeroElementAndThrowException() {
        //when
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetElevenElementAndThrowException() {
        //when
        list.get(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetNegativeElementAndThrowException() {
        //when
        list.get(-1);
    }

    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception {
        //given
        int expected = 0;

        //when
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromListAndReturnZero() throws Exception {
        //given
        int expected = 0;

        //when
        list.add(1);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldIncreaseArrayLength() throws Exception {
        //given
        int expected = 12;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }

        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 12", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLength() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthToTen() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldRemoveSecondElementFromListAndReturnOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    //////////////
    // Тесты ДЗ //
    /////////////

    @Test
    public void shouldAddToStartArrayElementFive(){
        //given
        int expected = 5;

        //when
        list.addInStartElement(5);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 5", expected, actual);
    }

    @Test
    public void shouldAddToStartArrayElementZeroAndShowFourthElementArray(){
        //given
        int expected = 4;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.addInStartElement(0);
        int actual = list.get(4);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 4", expected, actual);
    }

    @Test
    public void shouldAddToStartArrayElementTen(){
        //given
        int expected = 10;

        //when
        list.addInStartElement(10);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 5", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementArrayAndShowChangedFirstElementSix(){
        //given
        int expected = 6;

        //when
        for(int i = 0; i < 9; i++)
            list.add(i + 5);
        list.removeOfStartElements();
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 6", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementArrayAndShowChangedSecondElementSeven(){
        //given
        int expected = 7;

        //when
        for(int i = 0; i < 9; i++)
            list.add(i + 5);
        list.removeOfStartElements();
        int actual = list.get(1);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 7", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementArrayAndShowChangedFirstElementTen(){
        //given
        int expected = 10;

        //when
        for(int i = 0; i < 9; i++)
            list.add(i + 5);
        list.removeOfStartElements();
        list.removeOfStartElements();
        list.removeOfStartElements();
        list.removeOfStartElements();
        list.removeOfStartElements();
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public  void shouldAddElementInTwoIndexArraySeven(){
        //given
        int a = 1, b = 7;
        int expected = 7;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.addElementInMiddleArray(1, 7);
        int actual = list.get(1);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 7", expected, actual);
    }
    @Test
    public  void shouldAddElementInTwoIndexArrayAndShowThirdElementArray(){
        //given
        int a = 1, b = 7;
        int expected = 2;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.addElementInMiddleArray(1, 7);
        int actual = list.get(2);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public  void shouldAddElementInTwoIndexArrayAndShowFirstElementArray(){
        //given
        int a = 1, b = 7;
        int expected = 1;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.addElementInMiddleArray(1, 7);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldRemoveSixElementInMeddleArray(){
        //given
        int a = 5;
        int expected = 7;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.removeElementInMeddleArray(6);
        int actual = 7;

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 7", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementInMeddleArrayAndShowLastElement(){
        //given
        int a = 0;
        int expected = 0;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.removeElementInMeddleArray(0);
        int actual = 0;

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }
    @Test
    public void shouldRemoveFiveElementInMeddleArrayAndShowFourElement(){
        //given
        int a = 4;
        int expected = 5;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.removeElementInMeddleArray(4);
        int actual = 5;

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 5", expected, actual);
    }

    @Test
    public void shouldElementArrayByValueFour(){
        //given
        int expected = 4;

        //when
        list.getElementByValue(4);
        int actual = 4;

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 4", expected, actual);
    }

    @Test
    public void shouldElementArrayByValueEleven(){
        //given
        int expected = -1;

        //when
        list.getElementByValue(11);
        int actual = -1;

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is -1", expected, actual);
    }

    @Test
    public void shouldElementArrayByValue8(){
        //given
        int expected = 8;

        //when
        list.getElementByValue(8);
        int actual = 8;

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 8", expected, actual);
    }

    @Test
    public void shouldShowThreeElementsAsString(){
        //given
        String expected = "1 - 2 - 3";

        //when
        for (int i = 1; i < 4; i++)
            list.add(i);
        String actual = list.getAllElementAsString();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is \"1 - 2 - 3\"", expected, actual);
    }

    @Test
    public void shouldShowAllElementsAsString(){
        //given
        String expected = "1 - 2 - 3 - 4 - 5 - 6 - 7 - 8";

        //when
        for (int i = 1; i < 9; i++)
            list.add(i);
        String actual = list.getAllElementAsString();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is \"1 - 2 - 3 - 4 - 5 - 6 - 7 - 8\"", expected, actual);
    }

    @Test
    public void shouldSortAllSevenElementArray() {
        //given
        int expected = 11;

        //when
        list.add(23);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(7);
        list.add(14);
        list.sortArray();
        int actual = list.get(3);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test()
    public void shouldSortAllEightElementArray() {
        //given
        int expected = 11;

        //when
        list.add(23);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(7);
        list.add(14);
        list.add(-1);
        list.sortArray();
        int actual = list.get(4);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test
    public void shouldSortAllSixElementArray() {
        //given
        int expected = -1;

        //when
        list.add(23);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(14);
        list.add(-1);
        list.sortArray();
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is -1", expected, actual);
    }
}