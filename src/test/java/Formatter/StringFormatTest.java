package Formatter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringFormatTest {

    @Test
    public void MustNotBeNull() {
        //arrange
        StringFormat formatter = new StringFormat();
        //act
        //assert
        assertNotNull(formatter);

    }

    @Test
    public void mustReturnStringWhenReversed() {
        //arrange
        StringFormat formatter = new StringFormat();
        String testString = "test";
        //act
        String result = formatter.reverse(testString);
        //assert
        assert (result.getClass() == String.class);
    }

    @Test
    public void mustReturnReversedStringWhenReversed() {
        //arrange
        StringFormat formatter = new StringFormat();
        String testString = "testsomething";
        //act
        String result = formatter.reverse(testString);
        //assert
        assertEquals("gnihtemostset", result);
    }

    @Test
    public void mustReturnLowerCaseStringWhenToLowerCase() {
        //arrange
        StringFormat formatter = new StringFormat();
        String testString = "Test";
        //act
        String result = formatter.toLowercase(testString);
        //assert
        assertEquals("test", result);
    }

    @Test
    public void mustReturnUppercaseStringWhenToUpperCase() {
        //arrange
        StringFormat formatter = new StringFormat();
        String testString = "Test";
        //act
        String result = formatter.toUpperCase(testString);
        //assert
        assertEquals("TEST", result);
    }


}
