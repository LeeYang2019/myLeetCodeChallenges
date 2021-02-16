import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("VIII")); //return 4
    }

    public static int romanToInt(String s) {
        int storedValues = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();

        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (charMap.get(s.charAt(i))
                    >= charMap.get(s.charAt(i + 1))) {
                storedValues = storedValues + charMap.get(s.charAt(i));
            } else {
                storedValues = storedValues - charMap.get(s.charAt(i));
            }
        }
        storedValues = storedValues + charMap.get(s.charAt(s.length() - 1));

        return storedValues;
    }
}
