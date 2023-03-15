import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        MergeSort mergeSort = new MergeSort();
        long startTime = System.currentTimeMillis();
        mergeSort.sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Merge Sort işlem süresi: " + (endTime - startTime) + " milisaniye");
    }
}