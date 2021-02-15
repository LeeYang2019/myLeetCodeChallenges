import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FindingDuplicates {
    public static void main(String[] args) {
        //given an array with duplicates, return an array with only the duplicates
        int[] num = new int[]{1,2,3,4,2,1,3,2,1,2,3,4,5,12,3,4,4,4,4};
        System.out.println(getDuplicates(num).toString());
    }
      public static ArrayList<Integer> getDuplicates(int[] nums) {
        // create hashmap
        HashMap<Integer, Integer> dupMap = new HashMap<>();

        // loop throug array
        for (int i = 0; i < nums.length; i++) {
            // if map contains key, update the value
            if (dupMap.containsKey(nums[i])) {
                int count = dupMap.get(nums[i]);
                dupMap.put(nums[i], count + 1);
            } else {
                // if map does not contain key, add key to map
                dupMap.put(nums[i], 1);
            }
        }

        // get keys
        Set<Integer> keySet = dupMap.keySet();

        // get values
        Collection<Integer> valueSet = dupMap.values();

        // create arraylist of keys
        ArrayList<Integer> dupArrList = new ArrayList<>(keySet);

        // create array of values
          ArrayList<Integer> dupValuesList = new ArrayList<>(valueSet);

//        // iterate through map and add keys
//        dupMap.forEach((k, v) -> {
//            if (v > 1) {
//                dupArrList.add(k);
//            }
//          });
        return dupValuesList;

    }
}
