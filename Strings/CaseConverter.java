import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String convertedString = convertCase(input);

        System.out.println("Converted string: " + convertedString);
    }

    private static String convertCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar)) {
                // Convert uppercase to lowercase
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                // Convert lowercase to uppercase
                charArray[i] = Character.toUpperCase(currentChar);
            }
            // If the character is not an alphabet character, ignore it and keep it unchanged
        }

        // Convert char array back to string
        return new String(charArray);
    }
}
