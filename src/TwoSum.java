import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
// example: [2,7,11,15], target = 9 => [0,1]
public class TwoSum {
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 26;

        long startTime = System.nanoTime();

        //System.out.println(Arrays.toString(solutionOne(nums, target)));
        //System.out.println(Arrays.toString(solutionTwo(nums, target)));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("run-time is : " + duration + " ms");
    }

    public static int[] solutionOne(int[] nums, int target) {
        int values = 0;

        // loop through every element in the array
        for (int i = 0; i < nums.length; i++) {

            //loop through every element in the array starting i + 1
            for (int j = i + 1; j < nums.length; j++) {

                //if value of i + value of j = target
                if (nums[i] + nums[j] == target) {

                    //return new int[]{i,j}
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] solutionTwo(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // loop through every element of array
        for (int i = 0; i < nums.length; i++) {

            // put value and pos in map
            map.put(nums[i], i); //map(value, pos)
        }

        // loop through every element of array
        for (int i = 0; i < nums.length; i++) {

            // get complement
            int complement = target - nums[i]; //7 = 9 - 2

            //if array has comp pos
            if (map.containsKey(complement) && map.get(complement) != i) {

                //return new int
                return new int[]{i, map.get(complement)}; //int[]{0,1}
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] solutionThree(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); //Map(value, position)

        //loop throw array
        for (int i = 0; i < nums.length; i++) {

            // for every nums[i], get its complement
            int complement = target - nums[i]; //9 - 7 = 2

            // if map contains complement
            if (map.containsKey(complement)) {

                // return new int[] with comp pos and pos
                return new int[]{map.get(complement), i};
            }
            //put value, pos in map
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
