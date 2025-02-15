public class BinarySearchRotation {
    public static void main(String[] args) {
        int[] rotatedArr = {6, 7, 8, 1, 2, 3, 4, 5};
        System.out.println(findRotationPoint(rotatedArr));
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
