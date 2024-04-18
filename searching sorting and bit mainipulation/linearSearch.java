/*  linearSearch 
    TC = O(n)
    SC = O(1)
  */

import java.util.*;
import java.io.*;

public class linearSearch {
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

        // implementation of linear search
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("element not found ");
        } else {
            System.out.println("element found at index : " + idx);
        }

    }

}