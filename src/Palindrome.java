import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome((21212)));
    }

    public static boolean isPalindrome(int num) {
        //convert int to string
        String numArr = Integer.toString(num);

        //stack to store elements of string
        Stack<Character> stk = new Stack<Character>();

        //loop through string
        for (int i = 0; i < numArr.length(); i++) {
            //push elements onto stack
            stk.push(numArr.charAt(i));
        }

        //loop through string
        for (int j = 0; j < numArr.length()/2; j++) {
            //check if last items in stack equal first few items in array
            if (numArr.charAt(j) != stk.pop()) {
                return false; //if there is no match
            }
        }
        return true; //if last values in stack match first values in array
    }
}
