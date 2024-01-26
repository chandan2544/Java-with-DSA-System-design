// former loan calculator in java 

import java.util.*;

class formerLoan {
    int pa;
    float td;
    static float ri;
    float si;
    static {
        ri = 4.5f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the amount required");
        pa = scan.nextInt();
        System.out.println("please enter the time/duration ");
        td = scan.nextFloat();

    }

    void compute() {
        si = (pa * td * ri) / 100f;
    }

    void disp() {
        System.out.println("SI is : " + si);
    }
}

public class formerLoanProject {
    public static void main(String[] args) {
        formerLoan f1 = new formerLoan();
        formerLoan f2 = new formerLoan();

        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();
    }
}
