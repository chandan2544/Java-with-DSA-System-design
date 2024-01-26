// static Block Vs java Instialisation Block

public class staticBlockVsjavaInstialisationBlock{
    static int age ;

    static {
        System.out.println("static block");
        age=17;
    }
    static void disp(){
        System.out.println("display static method");
        System.out.println(age);
    }

    public static void main(String[] args) {

        System.out.println("main  method ");
        disp();
    }
}
