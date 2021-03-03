

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// example: [1,2,3,4,5] => [1, 1+2, 1+2+3, 1+2+3+4, 1+2+3+4+5] => [1,3,6,10,15]
public class RunningSum1DArray implements Solution{
    public int[] run(int[] nums) {
        for (int i = 1; i < nums.length; i++) { // i starts at pos 1, not 0
            //add the last value in last pos to curr pos value
            nums[i] += nums[i - 1]; // [1, 2+1, 3+3, 4+6]
        }
        return nums;
    }
}


