// TC = 0(n)
// SC = 0(1)

/*
 We assume the array is a palindrome initially.
We iterate over the first half of the array.
For each element, we compare it with its corresponding element from the end of the array.
If any pair of elements doesn't match, we set isPalindrome to false and break out of the loop.
Finally, we print whether the array is a palindrome or not based on the value of isPalindrome.
 */
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
