// topic - Exception handling vs Ducking 
//throw in Exception handling

class Demo
{
    public void a() throws Exception
    {
       b();
    }
    public void b() throws Exception
    {
        int num1=8;
        int num2=0;

        int result=num1/num2;
        System.out.println(result);

    }
}

public class exceptional_handling6 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        
        try {
            obj.a();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error "+ e);
        }
    }
}
