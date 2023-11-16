/* Anonyms_Array is a  arraywhich have not name
   this array is created for instance of use
 */

 class calc{
    public int add(int nums[]){
        int result=0;
        for (int n : nums) {
            result=result+n;
        }
        return result;
    }
 }
public class Anonyms_Array {
public static void main(String[] args) {
    calc obj=new calc();

    // anonyms array
    int result=obj.add(new int [] {5,3,7,9});
    System.out.println(result);
}
}