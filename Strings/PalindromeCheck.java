/*2.Write a java program to know whether the given string is palindrome */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive palindrome check
        str = str.replaceAll("\\s", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Characters don't match, not a palindrome
            }
            start++;
            end--;
        }

        return true; // All characters matched, it's a palindrome
    }
}
