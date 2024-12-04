public class fibonacciSeries {

 public static void calcFibonacci(int a,int b){
    for (int i = 0; i < 10; i++) {
        int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
}
    public static void main(String[] args) {
        int a = 0; 
        int b = 1;
        System.out.println("a:"+a+" "+"b:"+b);
        
        calcFibonacci(a, b);
    }
}
