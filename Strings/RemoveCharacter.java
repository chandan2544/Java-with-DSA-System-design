import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String modifiedString = removeCharacter(input, charToRemove);

        System.out.println("Modified string: " + modifiedString);
    }

    private static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Only append characters that are not equal to the character to remove
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
