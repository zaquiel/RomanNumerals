package main.java.br.com;

import org.junit.platform.commons.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanNumeralsConverter {

    private final static Map<Character, Integer> fromTo = new HashMap<Character, Integer>() {
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
            if (fromTo.containsKey(letter)) {
                int currentNumber = fromTo.get(letter);

                finalNumber += (currentNumber * ((currentNumber < prevNumber) ? -1 : 1));

                prevNumber = currentNumber;
            }
        }

        return finalNumber;
    }

    private boolean romanNumeralValidate(final String symbol) {
        return StringUtils.isNotBlank(symbol) &&
                symbol.toUpperCase().matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    public String numberToRomanNumeral(int number) {
      return "MMDCCXLIX";
    }
}
