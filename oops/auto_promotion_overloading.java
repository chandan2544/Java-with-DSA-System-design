/* auto_promotion_overloading */
/* heirarchy byte - short - int - long - float - double */
/*                    char - intthen same sequence */

class Calc {
    public void show(byte num) {
        System.out.println("byte " + num);
    }

    public void show(short num) {
        System.out.println("short " + num);
    }

    public void show(char num) {
        System.out.println("char " + num);
    }

    public void show(int num) {
        System.out.println("int " + num);
    }

    public void show(double num) {
        System.out.println("double " + num);
    }
}

public class auto_promotion_overloading {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int b = 5;
        obj.show(b);
    }
}
