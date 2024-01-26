public class waysToCompareString {
public static void main(String[] args) {
    
    // 1st way (==) which checks referenced object is same or not
     String s1="pwskill";
    String s2=new String("pwskill");

    System.out.println(s1==s2); // false

    // 2nd way (equals) which the their exact values
   System.out.println(s1.equals(s2));
    
}
}