/* length vs length() */

public class length {
public static void main(String[] args) {
    // int marks[]={5,4,3,7};

    // // in 1d Array
    // //length is a property of Array
    // System.out.println(marks.length);

    // in 2d Array
    int num[][] = {
        { 5, 9 }, 
        { 1, 3 },
        { 7, 4 }
};
    System.out.println(num[0].length);

    // length() is a method
    String name="chandan";

    System.out.println(name.length());
}
}
