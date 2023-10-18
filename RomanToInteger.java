Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public static int romanToInteger(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanMap.get(roman.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Change this to the Roman numeral you want to convert.
        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Integer Equivalent: " + integerEquivalent);
    }
}
