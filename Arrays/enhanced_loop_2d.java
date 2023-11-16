public class enhanced_loop_2d {
    public static void main(String[] args) {
        int num[][]={
            {5,3,5,9,7},
            {8,3,1,6,4},
            {7,5,3,1,9}
        };
        for (int a[] : num) {
            for (int b : a) {
                System.out.print(b +" ");
            }
            System.out.println();
        }
        
    }
}
