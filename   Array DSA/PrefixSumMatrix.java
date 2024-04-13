import java.util.*;

public class PrefixSumMatrix {

    public static void prefixSumMatrix(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        // Calculate row-wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // Calculate column-wise prefix sum
        for (int j = 0; j < n; j++) { // Fixing the loop here
            for (int i = 1; i < m; i++) { // Fixing the loop here
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int sumRegion(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = arr[r2][c2];
        int up = (r1 > 0) ? arr[r1 - 1][c2] : 0;
        int left = (c1 > 0) ? arr[r2][c1 - 1] : 0;
        int overlap = (r1 > 0 && c1 > 0) ? arr[r1 - 1][c1 - 1] : 0;
        return sum - up - left + overlap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the matrix:");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of r1 coordinates :");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of c1 coordinates :");
        int c1 = sc.nextInt();
        System.out.println("Enter the value of r2 coordinates :");
        int r2 = sc.nextInt();
        System.out.println("Enter the value of c2 coordinates :");
        int c2 = sc.nextInt();

        prefixSumMatrix(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements in the given rectangle: " + result);
    }
}