// BinarySearch 
// TC=O(logN)
// SC=O(1)

import java.util.*;
import java.io.*;

public class binarySearch {

    public static int BinarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element present in an array : ");
        int n = sc.nextInt();

        System.out.println("enter the arrays element :  ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // target element
        System.out.println("enter target element : ");
        int x = sc.nextInt();

        // function calling of BinarySearch
        int result = BinarySearch(arr, x);

        if (result == 0) {
            System.out.println("element not found ");
        } else {
            System.out.println("element found at index : " + result);
        }
    }
}
