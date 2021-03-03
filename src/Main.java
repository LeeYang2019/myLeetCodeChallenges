import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Runner newRunner = new Runner(new RunningSum1DArray());
        int[] results = newRunner.run(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(results));
    }
}
