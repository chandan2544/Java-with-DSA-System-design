// TC = 0(n)
// SC = 0(1)

public class Palindrome {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 2, 1, 6 };
        int n = array.length;
        boolean isPalindrome = true; // Assume it's a palindrome until proven otherwise

        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - i - 1]) {
                isPalindrome = false; // If elements don't match, it's not a palindrome
                break; // No need to continue checking
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome array");
        } else {
            System.out.println("Not a palindrome array");
        }
    }
}
