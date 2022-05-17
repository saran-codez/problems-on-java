
import java.util.*;

class PeakElement {
    static List<Integer> list = new ArrayList<>(1);

    static int findPeak(int arr[], int n) {
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                list.add(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67,10,25,14};
        int n = arr.length;
        int x = findPeak(arr, n);
        if (list.isEmpty()) {
            System.out.print("Peak Element is" + arr[x]);
        } else {
            System.out.println("Peak Elements are : ");
            for (int i : list) {
                System.out.println(arr[i]);
            }
        }
    }
}

