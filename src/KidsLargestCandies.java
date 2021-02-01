import java.util.ArrayList;
import java.util.List;

public class KidsLargestCandies {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2};

        System.out.println(largestCandiePiles(arr, 3));
    }

    public static List<Boolean> largestCandiePiles(int[] candies, int extraCandies) {
        int largestPile = candies[0];
        List<Boolean> myList = new ArrayList<Boolean>();

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > largestPile) {
                largestPile = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++) {
          myList.add((candies[j] + extraCandies) >= largestPile ? true : false);
        }
        return myList;
    }
}
