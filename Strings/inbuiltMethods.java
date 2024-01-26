/* inbuilt string methods */

public class inbuiltMethods {
    public static void main(String[] args) {
        String  str="Pw skill java";

        System.out.println(str);

        // to make all string in uppercase
        System.out.println(str.toUpperCase());

        // to make all string in lowercase
        System.out.println(str.toLowerCase());

        // to calculate length of string
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(3, 8));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}
