public class Type_of_String {
    public static void main(String[] args) {
        // types of String in java
        //  1. immutable (not changeable)
        //  2. mutable (changeable) we  use here //  1.stringbuilder 2.stringbuffer

        // immutable string
        String name="chandan";
        System.out.println(name);
        name.concat("kumar");
        System.out.println(name);

         // mutable string
        StringBuilder name1=new StringBuilder("Aman kumar");
        System.out.println(name1);
        name1.append(" jha");
        System.out.println(name1);

    }
}