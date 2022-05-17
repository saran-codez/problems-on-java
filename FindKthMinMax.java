import java.util.*;

public class FindKthMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 2, 4, 3, 6, 5, 9, 8 };
        System.out.print("Enter the value of N :");
        int k = scanner.nextInt();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        if (k > arr.length || k == 0)
            System.out.println("K is larger than array length");
        else {
            System.out.println(k + " th Largest element is : " + arr[arr.length - k]);
            System.out.println(k + " th Smallest element is : " + arr[k - 1]);
        }
        scanner.close();
    }
}
