import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = "saran";

        int[][] array = new int[3][];
        for (int i = 0; i < array.length; i++) {
            int size = sc.nextInt();
            array[i] = new int[size];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int[] sub : array) {
            for (int i : sub) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("-------------------");
        }

        sc.close();
    }
}
