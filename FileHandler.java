package lab_task;


public abstract class FileHandler {
    protected SortStrategy sortStrategy;

    public FileHandler(SortStrategy strategy) {
        this.sortStrategy = strategy;
    }

   
    public final void processFile(String fileName) {
        openFile(fileName);
        int[] data = readArray();
        
        System.out.println("--- Starting Strategy Step ---");
        sortStrategy.sort(data); 
        System.out.println("------------------------------");
        
        saveArray(data);
        closeFile();
    }

    private void openFile(String name) {
        System.out.println("Step 1: Opening file [" + name + "]");
    }

    private int[] readArray() {
        System.out.println("Step 2: Reading array from file...");
        return new int[]{15, 2, 8, 4}; 
    }

    private void saveArray(int[] data) {
        System.out.println("Step 3: Overwriting file with the sorted array.");
    }

    private void closeFile() {
        System.out.println("Step 4: File closed successfully.");
    }
}