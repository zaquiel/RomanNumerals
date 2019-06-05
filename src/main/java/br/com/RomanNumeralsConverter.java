package main.java.br.com;

import org.junit.platform.commons.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class RomanNumeralsConverter {

    private final static Map<Character, Integer> fromRomanToNumber = new HashMap<Character, Integer>() {
        {
            put('I',1);
            put('V', 5);
            put('X',10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    private final static TreeMap<Integer,String> fromNumberToRoman = new TreeMap<Integer, String>() {
        {
            put(1,"I");
            put(4,"IV");
            put(5,"V");
            put(9,"IX");
            put(10,"X");
            put(40,"XL");
            put(50,"L");
            put(90,"XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000,"M");
        }
    };

    private boolean romanNumeralValidate(final String symbol) {
        return StringUtils.isNotBlank(symbol) &&
                symbol.toUpperCase().matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    public int romanNumeralToNumber(final String symbol) throws InvalidRomanNumeralException {

        if (!romanNumeralValidate(symbol)) {
            throw new InvalidRomanNumeralException("Invalid roman numeral.");
        }

        final String romanNumeral = symbol.toUpperCase();

        final List<Character> letters = romanNumeral.chars().mapToObj(item -> (char) item)
                .collect(Collectors.toList());

        Collections.reverse(letters);

        int finalNumber = 0;

        int prevNumber = 0;

        for (final Character letter : letters) {
            if (fromRomanToNumber.containsKey(letter)) {
                int currentNumber = fromRomanToNumber.get(letter);

                finalNumber += (currentNumber * ((currentNumber < prevNumber) ? -1 : 1));

                prevNumber = currentNumber;
            }
        }

        return finalNumber;
    }

    private boolean numberValidate(int number) {
        return (number > 0 && number < 4000);
    }

    public String numberToRomanNumeral(int number) throws InvalidRomanNumeralException {
        if (!numberValidate(number)) {
            throw new InvalidRomanNumeralException("Invalid number for conversion.");
        }
        int key = fromNumberToRoman.floorKey(number);

        if (number == key) {
            return fromNumberToRoman.get(number);
        }

        return fromNumberToRoman.get(key) + numberToRomanNumeral(number - key);
    }

}
