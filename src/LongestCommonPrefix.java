

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = new String[]{"flight","flow","flick"};
        System.out.println(lngestCommPref(words));
        //System.out.println(longestCommonPrefix(words));
        //test();
    }

    public static String lngestCommPref(String[] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            System.out.println("word: " + strs[i]);
            for (int j = 0; j < strs[i].length(); j++) {
                System.out.println("j : " + strs[i].charAt(j));
            }
        }

        return "";
    }

    // leetcode solution using substring to create a new string
    // and indexOf to determine if a substring is contained within another string
    // with -1 for no and 0 for yes
    // while loop will run until strs[i] contains the substring that is defined by prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0]; // prefix is assigned with item as pos 0

        // loop through all items in the array beginning at pos 1
        for (int i = 1; i < strs.length; i++)
            // while there is still not a match or 0
            while (strs[i].indexOf(prefix) != 0) {
                // create a new string with a string that is one character shorter than before
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void test() {
        String testString = "alpha"; //string
        String prefix = "alphabet"; //substring

        // while testString does not contain prefix
        while (testString.indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            System.out.println("prefix: " + prefix);
            System.out.println("index: " + testString.indexOf(prefix));
        }
    }
}
