/* StringBuffer/StringBuilder is a type of mutable String 
   by default it has capacity of  (16)
   if size of string is increased from 16 then 

   new Capacity = (current capacity + 1) * 2
 */

public  class capacityOfMutableString {
public static void main(String[] args) {
  
    // StringBuffer sb=new StringBuffer();
    // System.out.println(sb.capacity());  //16

    // StringBuilder s1=new StringBuilder();
    // System.out.println(s1.capacity());  //16

    // sb.append("abcdefghijklmnop");   
    // System.out.println(sb.capacity());  //16

    // sb.append("a");      
    // System.out.println(sb.capacity());  //34
    // System.out.println(sb.length());   //17

    // StringBuffer sb2=new StringBuffer("Sachin");
    // System.out.println(sb2);
    // System.out.println(sb2.capacity());  // 22
    // System.out.println(sb2.charAt(1));
    // sb2.setCharAt(1, 'A');
    // System.out.println(sb2);

    // StringBuilder sb3=new StringBuilder(150);
    // System.out.println(sb3.capacity());  //150
    // sb3.append("java"); 
    // System.out.println(sb3);
    // sb3.trimToSize();
    // System.out.println(sb3.capacity());

//     StringBuilder sb4=new StringBuilder("pwjava");
//     System.out.println(sb4);
//     System.out.println(sb4.reverse());
   }
}