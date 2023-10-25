public class incrementOrDecrement {
    public static void main(String[] args) {
        // int a=5;
        // a++;
        // a--;
        // System.out.println(a);

        // int a=5;
        // int b=a++;
        // System.out.println(a);
        // System.out.println(b);

        // int a=5;
        // int b=++a;
        // System.out.println(a);
        // System.out.println(b);

        // example 1
        // int a=5;
        // int b=a++ + ++a + --a;
        // System.out.println(a);
        // System.out.println(b);

        //example 2
        int a=5;
        int b=a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(b);
    }
}
