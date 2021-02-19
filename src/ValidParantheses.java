import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        //System.out.println(isValid("(([]))"));
        System.out.println(alsoValid("()[]{}"));
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
                // the following conditions have to be true otherwise stk does not pop
            } else if (c == ')' && !stk.isEmpty() && stk.peek() == '(' ) {
                stk.pop();
            } else if (c == '}' && !stk.isEmpty() && stk.peek() == '{') {
                stk.pop();
            } else if (c == ']' && !stk.isEmpty() && stk.peek() == '[') {
                stk.pop();
            }
        }

        return stk.isEmpty();
    }

    // leetcode solution with hashmap && stack
    public static boolean alsoValid(String s) {
        if (s.length() % 2 != 0) return false;

        HashMap<Character, Character> charMap = new HashMap<>();
        Stack<Character> stk = new Stack<>();

        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        for (char c : s.toCharArray()) {

            // If the current character is a closing bracket.
            if (charMap.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stk.empty() ? '#' : stk.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != charMap.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stk.push(c);
            }
        }

        return stk.isEmpty();
    }
}
