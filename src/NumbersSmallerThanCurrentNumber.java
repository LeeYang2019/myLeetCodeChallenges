import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] num = new int[]{8,1,2,2,3};
        System.out.println(Arrays.toString(smallerThanCurr(num)));
    }

    //initial solution
    public static int[] smallerThanCurr(int[] arr) {
        //create counter, new array
        int counter = 0;
        int[] newArr = new int[arr.length];

        //loop through arr
        for (int i = 0; i < arr.length; i++) {
            //counter resets to 0 at every pass
            counter = 0;

            //loop through arr and compare j with i
            for (int j = 0; j < arr.length; j++) {

                //if i > j, increment counter and store it in newArr at pos i
                if (arr[i] > arr[j]) {
                    counter++; // count number times i > j
                    newArr[i] = counter;
                }
            }
        }

        return newArr;
    }
}
