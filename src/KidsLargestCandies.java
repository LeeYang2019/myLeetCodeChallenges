import java.util.ArrayList;
import java.util.List;

public class KidsLargestCandies {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2};

        //expect: {true, true, true, true}
        System.out.println(largestCandiePiles(arr, 3));
    }

    public static List<Boolean> largestCandiePiles(int[] candies, int extraCandies) {
        //create largestPile with initial value
        int largestPile = candies[0];

        //create arrayList with List implementation
        List<Boolean> myList = new ArrayList<Boolean>();

        //loop through candies
        for (int i = 1; i < candies.length; i++) {
            //get the largestPile
            if (candies[i] > largestPile) {
                largestPile = candies[i];
            }
        }

        //loop through candies
        for (int j = 0; j < candies.length; j++) {

            //if the pile of each kid's candy plus any extra candy is equal to or greater than the largestPile
            if (candies[j] + extraCandies >= largestPile) {
                myList.add(true);
            } else {
                myList.add(false);
            }
        }
        return myList;
    }
}
