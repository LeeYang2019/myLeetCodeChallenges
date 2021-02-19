import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(solutionOne("ABCAB"));
        //System.out.println(solutionTwo("A"));
    }

    // solutionOne
    public static String solutionOne(String str) {

        // if str is empty return ""
        if (str.isEmpty()) return "";

        // if one one string is provided return itself
        if (str.length() == 1) return str;

        String retValue = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return String.valueOf(str.charAt(i));
                }
            }
        }

        return retValue;
    }

    // working solution with LinkedHasMap. Since LinkedHashMap preserves insertion order,
    // only worry about the number of instances of a char. First char with least number of instances
    // should be returned
    public static String solutionTwo(String str) {

        // if empty
        if (str.isEmpty()) return "";

        // if length is 1
        if (str.length() == 1) return str;

        String retValue = String.valueOf(str.charAt(0));
        int smallest = 2;

        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            // if charMap contains c, increment count
            if ( charMap.containsKey(c)) {
                int count = charMap.get(c);
                charMap.put(c, count + 1); // Map does not allow duplicate, duplicate will only get updated.
            } else {
                // charMap does not contain c, add
                charMap.put(c, 1);
            }
        }

        // get the char with the least number of times shown up
        for (char k: charMap.keySet()) {
            if (charMap.get(k) < smallest) {
                smallest = charMap.get(k);
                retValue = String.valueOf(k);
            };
        }

        return retValue;
    }
}
