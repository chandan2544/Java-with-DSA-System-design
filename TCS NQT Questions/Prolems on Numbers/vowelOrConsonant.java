import java.util.Scanner;

public class vowelOrConsonant {

    public static void checkVowelOrConsonant(char c){
        if (c=='a'||c=='e'||c=='o'||c=='i'||c=='u') {
            System.out.println(c+" is vowel");
        } else {
            System.out.println(c+" is Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter character : ");
        char c=sc.next().charAt(0);

        vowelOrConsonant.checkVowelOrConsonant(c);
        
    }
}
