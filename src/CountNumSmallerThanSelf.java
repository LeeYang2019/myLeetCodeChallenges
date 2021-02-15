import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountNumSmallerThanSelf {
    // You are given an integer array nums
    // and you have to return a new counts array.
    // The counts array has the property
    // where counts[i] is the number of smaller elements to the right of nums[i].
    public static void main(String[] args) {
        int[] num = new int[]{5,2,6,1};
        //System.out.println(Arrays.toString(solutionOne(num)));
        //System.out.println(solutionTwo(num));
        System.out.println(solutionThree(num));
    }

    public static int[] solutionOne(int[] nums) {
        int counter = 0;
        int[] newArr = new int[nums.length];

        for (int i = 0; i <= nums.length; i++) {
            counter = 0;

            //loop through nums array beginning at i
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    counter++; //for i = 5, counter = 1 then 2
                    newArr[i] = counter; //sets twice at 1 then 2
                }
            }
        }
        return newArr;
    }

    //solution works but not efficient enough
    public static List<Integer> solutionTwo(int[] nums) {
        int counter = 0;
        List<Integer> myList = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            counter = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    counter++;
                }
            }
            myList.add(counter);
        }
        return myList;
    }
    //example {5,2,6,1}
    public static List<Integer> solutionThree(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        //loop backwards 3,2,1,0 or {1,6,2,5}
        for(int i = nums.length -1; i>= 0; i--) {
            //last value case
            if(sorted.isEmpty()) {
                System.out.println("code enters here first");
                sorted.add(nums[i]); //add last element
                result.add(0); //add 0
                System.out.println("sorted: " + sorted);
                System.out.println("result: " + result);
            } else if(nums[i]>sorted.get(sorted.size()-1)){
                System.out.println("-------------------------");
                System.out.println("code enters here second");
                System.out.println("nums[i]: " + nums[i]);
                System.out.println("sorted.get(sorted.size()-1): " + sorted.get(sorted.size() -1 ));
                System.out.println("nums[i] is greater than sorted.get(sorted.size()-1), is added to end");
                sorted.add(sorted.size(), nums[i]); //add to end
                System.out.println("sorted: " + sorted);
                result.add(sorted.size()-1); //add last item of sorted
                System.out.println("result: " + result);
            } else {
                System.out.println("----------------------");
                System.out.println("code enters here third");
                int l=0; //beginning
                int r=sorted.size()-1; //end

                System.out.println("sorted: " + sorted);
                System.out.println("result: " + result);

                System.out.println("r : " + (sorted.size()-1));

                while(l<r){
                    System.out.println("enter while loop, l < r" );
                    int m = l + (r-l)/2;

                    System.out.println("l: " + l + ", r: " + r + ", m: " + m);
                    System.out.println("nums[i] : " + nums[i]);
                    System.out.println("sorted.get(m) : " + sorted.get(m));

                    if(nums[i]>sorted.get(m)){
                        l=m+1;
                    }else{
                        r=m;
                    }
                }

                sorted.add(r, nums[i]);
                result.add(r);
            }

        }
        System.out.println("----------------------");
        System.out.println("Final: ");
        System.out.println("sorted: " + sorted);
        System.out.println("result: " + result);

        System.out.println("----------------------");
        System.out.print("Reversed: ");
        Collections.reverse(result);
        return result;
    }
}
