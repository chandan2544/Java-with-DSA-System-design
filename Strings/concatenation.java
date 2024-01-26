/* concatenation is of two type in String */
// 1. + operator
// 2. concat()

public class concatenation {
    public static void main(String[] args) {
        // concatenation using concat() method
        String s1 = "chandan kumar";
        System.out.println(s1);

        // s1.concat(" is a java developer ");
        // System.out.println(s1);

        // this is a way to concat immutable string
        s1 = s1.concat(" is a java developer ");
        System.out.println(s1);

        // concatenation using + operator

        String s2 = "pw";

        // using + operator we can join mutiple string but its not possible in concate()

        String s3 = "Pw " + "Skill " + "java " + "course";
        System.out.println(s2);
        System.out.println(s3);
    }
}
