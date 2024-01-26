import java.util.Scanner;

public class SubstringIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        int index = findSubstringIndex(mainString, subString);

        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found in the main string.");
        }
    }

    private static int findSubstringIndex(String mainString, String subString) {
        // Using indexOf to find the index of the substring
        int index = mainString.indexOf(subString);
        return index;
    }
}
