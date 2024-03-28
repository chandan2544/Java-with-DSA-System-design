// ENUM IS RARELY USED

enum Result{
    PASS,FAIL,NR;

    // public static final Result PASS=new Result();
    // public static final Result FAIL=new Result();
    // public static final Result NR=new Result();

    int marks;

    Result(){
        System.out.println("constructor in enum ");
    }

    void setMark(int marks){
        this.marks=marks;
    }
    
    int getMark() {
        return marks;
    }

}

public class Enum7 {
    public static void main(String[] args) {
        
        Result.PASS.setMark(50);

        int m1=Result.PASS.getMark();
        System.out.println(m1); //50

        int m2 = Result.FAIL.getMark();
        System.out.println(m2); //0

        Result.NR.setMark(45);
        int m3=Result.NR.getMark();
        System.out.println(m3); //45
    }
}
