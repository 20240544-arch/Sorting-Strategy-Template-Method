package lab_task;

public class SortContext {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] numbers) {
        if (strategy != null) {
            strategy.sort(numbers);
        } else {
            System.out.println("Please set a strategy first!");
        }
    }
}