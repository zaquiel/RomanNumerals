package test.java.br.com;

import main.java.br.com.InvalidRomanNumeralException;
import main.java.br.com.RomanNumeralsConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverterTest {

    /*******************RomanNumeral To Number*************************/

    @Test
    public void shouldConvertTheRomanNumeralI() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("I");

        assertEquals(1, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralV() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("V");

        assertEquals(5, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralII() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("II");

        assertEquals(2, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralXVI() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("XVI");

        assertEquals(16, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralXXVI() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("XXVI");

        assertEquals(26, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralIV() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("IV");

        assertEquals(4, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralXIV() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("XIV");

        assertEquals(14, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralXXIV() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("XXIV");

        assertEquals(24, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralXC() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("XC");

        assertEquals(90, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralCD() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("CD");

        assertEquals(400, number);
    }

    @Test
    public void shouldConvertTheRomanNumeralMMDCCXLIX() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("MMDCCXLIX");

        assertEquals(2749, number);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void shouldNotConvertTheInvalidRomanNumeralVZ() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final int number = romanNumeralsConverter.romanNumeralToNumber("VZ");

        assertEquals(1, number);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void shouldNotConvertTheEmptyRomanNumeral() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        romanNumeralsConverter.romanNumeralToNumber("");
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void shouldNotConvertTheNullRomanNumeral() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        romanNumeralsConverter.romanNumeralToNumber(null);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void shouldNotConvertTheBlankRomanNumeral() throws InvalidRomanNumeralException {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        romanNumeralsConverter.romanNumeralToNumber("  ");
    }

    /*******************RomanNumeral To Number*************************/

    /*******************Number To RomanNumeral*************************/

    @Test
    public void shouldConvertTheNumeral2749() {

        final RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        final String romanNumeral = romanNumeralsConverter.numberToRomanNumeral(2749);

        assertEquals("MMDCCXLIX", romanNumeral);
    }

    /*******************Number To RomanNumeral*************************/
}
