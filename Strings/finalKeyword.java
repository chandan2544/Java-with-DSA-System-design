public class finalKeyword {
public static void main(String[] args) {

    //final keywords make any variable constant
    final StringBuffer sb=new StringBuffer("virat");
    sb.append("kohli");

    // when we add final keyword before any reference  object  
    // sb=new StringBuffer("Sachin");
    // then above statement will give an error
    
    System.out.println(sb);
}
}