package lab_task;

public class Main {
    public static void main(String[] args) {
        SortStrategy myStrategy = new QuickSort();

        
        FileHandler handler = new FileHandler(myStrategy) {};

        System.out.println("Starting Lab Task Process...");
        handler.processFile("my_data.txt");
    }
}