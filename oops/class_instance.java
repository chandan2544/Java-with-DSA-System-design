
public class class_instance {
    int a;         // instance variable
    String name;    // instance variable
public static void main(String[] args) {
    int num=9;  // primitive
    class_instance obj1=new class_instance(); // reference
    class_instance obj2=new class_instance(); // reference

    // let check its independent or not
    obj1.name="chandan";
    obj1.a=5;
    /* in class instance all object have same variable which automatically independent  */
    /* in instance variable if we will not give any value then default  value  automatically assigned (string=null) or (int = 0) */ 
    System.out.println(obj1.a); 
    System.out.println(obj1.name);

    System.out.println(obj2.a); 
    System.out.println(obj2.name);
}
}
