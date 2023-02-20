package Assignment2023;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMorse {
    private Logic _logic;

    public TestMorse() {

        _logic = new Logic();
    }

    @Test
    public void ConvertMorse_ShouldReturnCorrectValue_WhenInputIsValidLetter() {

        //Arrange
        String testData = "a";
        String expected = "*- ";

        //Act
        String actual = String.valueOf(_logic.ConvertMorse(testData));

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertMorse_ShouldReturnCorrectValue_WhenInputIsValidMorse() {

        //Arrange
        String testData = "***--";
        String expected = "3";

        //Act
        String actual = String.valueOf(_logic.ConvertMorse(testData));

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Translate_ShouldReturnCorrectValue_WhenInputIsValidLetters() {

        //Arrange
        String testData = "Hello";
        String expected = "**** * *-** *-** ---";

        //Act
        String actual = (_logic.Translate(testData));

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Translate_ShouldReturnCorrectValue_WhenInputIsValidMorse() {

        //Arrange
        String testData = "**** **";
        String expected = "hi";

        //Act
        String actual = (_logic.Translate(testData));

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Translate_ShouldReturnErrorMessage_WhenInputIsInvalid() {

        //Arrange
        String testData = "!";
        String expected = "Invalid value: !";

        //Act
        String actual = (_logic.Translate(testData));

        //Assert
        assertEquals(expected, actual);
    }
}