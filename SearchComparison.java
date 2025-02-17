import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static void main(String[] args) {
        int dataSize = 1_000_000;
        int[] data = generateRandomArray(dataSize);
        int target = data[new Random().nextInt(dataSize)];

        long startTime = System.nanoTime();
        int linearIndex = linearSearch(data, target);
        long linearTime = System.nanoTime() - startTime;

        Arrays.sort(data);
        startTime = System.nanoTime();
        int binaryIndex = binarySearch(data, target);
        long binaryTime = System.nanoTime() - startTime;

        System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
        System.out.println("Target found at index (Linear): " + linearIndex);
        System.out.println("Target found at index (Binary): " + binaryIndex);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10);
        }
        return arr;
    }
}
