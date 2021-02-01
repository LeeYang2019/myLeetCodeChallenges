import java.util.ArrayList;
import java.util.List;

public class LargestInt {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,5,2};
        System.out.println(largestNum(arr, 3));
    }

    public static List<Boolean> largestNum(int[] arr, int num) {
        //declare and set initial value
        int largest = arr[0];

        //create arraylist with list implementation
        List<Boolean> myList = new ArrayList<Boolean>();

        //loop through and compare
        for (int i = 1; i < arr.length; i ++) {
            //if i > largest, set i as largest
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + num >= largest) {
                myList.add(true);
            } else {
                myList.add(false);
            }
        }

        return myList;
    }
}
