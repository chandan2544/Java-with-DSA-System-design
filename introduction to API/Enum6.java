// enum introduced in java 1.5v
// set of values that we  don't want change

//if we  gonna defined a constant then it  recommended to use capital letters
enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN
}

public class Enum6 {

    enum Result{
        Pass,Fail,NR;
    }
    public static void main(String[] args) {
        Week w=Week.MON;
        System.out.println(w);
        
        int index=Week.MON.ordinal();
        System.out.println("index : "+index);

    System.out.println("----------------------------------");
        
    Week wr[]=Week.values();
        for (Week w1 : wr) {
            System.out.println(w1+" : "+w1.ordinal());
        }

     System.out.println("----------------------------------");
        Result r=Result.Pass;
        System.out.println(r);
    }
}
