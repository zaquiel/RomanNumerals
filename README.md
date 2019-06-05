# Roman Numerals Converter

Tool developed in java with objective of convert roman numerals in number and vice versa.

## Requirements for execution
* jdk 8
* Junit 4

### Solution Summary

On class RomanNumeralsConverter were implemented the methods:

 * romanNumeralToNumber: Uses a HashMap<Character, Integer> with possible values for the roman numerals. Receive a roman numerals (string), verify if is valid and transform in List<Character>. Then scroll through the list by picking up each letter and searching in HashMap.
Always save the previous letter to check the case of numbers 4, 9, etc.

 * numberToRomanNumeral: Uses a TreeMap<Integer,String> with possible roman numerals for numbers. Receive a number (int), verify if is valid and call method floorKey of TreeMap, this method return the greatest key less than or equal to the given key. If the key is equal to the number received it returns only the corresponding value in the TreeMap, otherwise it recursively calls the method by decreasing the number by 1, it does this until it finds all the Roman numerals.