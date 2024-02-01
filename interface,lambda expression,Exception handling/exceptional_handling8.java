class MyException extends Exception{
    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}

public class exceptional_handling8 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;

        try {
            if (num2 < 0) {
             //throwing exception  by itself
                Exception e = new MyException("negative number");
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("enter a valid number "+e);
        }
    }
}
