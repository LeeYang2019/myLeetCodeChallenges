import java.util.Arrays;

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// example: [1,2,3,4,5] => [1, 1+2, 1+2+3, 1+2+3+4, 1+2+3+4+5] => [1,3,6,10,15]
public class RunningSum1DArray {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4}; //expect 1, 2, 3, 4, 5

        long startTime = System.currentTimeMillis();
        //System.out.println("Array: " + Arrays.toString(solutionOne(nums)) );
        System.out.println("Array: " + Arrays.toString(solutionTwo(nums)) );
        //System.out.println("Array: " + Arrays.toString(solutionThree(nums)) );
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime); //milliseconds
        System.out.println("run-time is : " + duration + " ms");
    }

    // worst solution
    public static int[] solutionOne(int[] nums) {
        int sumTotal = 0;
        int[] tmp = new int[nums.length];

        //loop through every element of array
        for (int i = 0; i < nums.length; i++) {

            //reset sumTotal to 0
            sumTotal = 0;

            //loop through every element of array with j < i
            for (int j = 0; j <= i; j++) {

                // add all num[j] up to i to sumTotal
                sumTotal += nums[j]; // num[j] + num[j - 1] + num[j - 2] ...
            }
            tmp[i] = sumTotal;
        }
       return tmp;
    }

    //best solution so far
    public static int[] solutionTwo(int[] nums) {

        // ex: [1,2,3,4]
        // loop through every element of array
        for (int i = 1; i < nums.length; i++) { // i starts at pos 1, not 0

            //add the last value in last pos to curr pos value
            nums[i] += nums[i - 1]; // [1, 2+1, 3+3, 4+6]
        }
        return nums;
    }

    //variation of solutionOne
    public static int[] solutionThree(int[] nums) {
        int runningSum = 0;
        int[] runningSums = new int[nums.length];

        for (int i = 0; i <nums.length; i++) {
            runningSum = runningSum + nums[i]; //0 + i,
            runningSums[i] = runningSum;
        }
        return runningSums;
    }
}


