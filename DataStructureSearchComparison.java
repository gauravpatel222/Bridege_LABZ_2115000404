import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N / 2;
        Random random = new Random();
        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            int num = random.nextInt(N * 10);
            array[i] = num;
            hashSet.add(num);
            treeSet.add(num);
        }

        // Array Search (O(N))
        long startTime = System.nanoTime();
        boolean foundInArray = linearSearch(array, target);
        long endTime = System.nanoTime();
        System.out.println("Array Search: " + (endTime - startTime) / 1_000_000.0 + " ms | Found: " + foundInArray);

        // HashSet Search (O(1))
        startTime = System.nanoTime();
        boolean foundInHashSet = hashSet.contains(target);
        endTime = System.nanoTime();
        System.out.println("HashSet Search: " + (endTime - startTime) / 1_000_000.0 + " ms | Found: " + foundInHashSet);

        // TreeSet Search (O(log N))
        startTime = System.nanoTime();
        boolean foundInTreeSet = treeSet.contains(target);
        endTime = System.nanoTime();
        System.out.println("TreeSet Search: " + (endTime - startTime) / 1_000_000.0 + " ms | Found: " + foundInTreeSet);
    }

    public static boolean linearSearch(int[] array, int target) {
        for (int num : array) {
            if (num == target) return true;
        }
        return false;
    }
}
