public class Runner {
    private Solution solution;

    // arg constructor
    public Runner(Solution solution) {
        super();
        this.solution = solution;
    }

    // run solution abstract method
    public int[] run(int[] numbers) {
        return solution.run(numbers);
    }
}
