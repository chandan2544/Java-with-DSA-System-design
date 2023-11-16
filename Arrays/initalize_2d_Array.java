public class initalize_2d_Array {
    public static void main(String[] args) {

        // its created in heap memory so its by default value is 0
        // int num[][]=new int[3][2];

        // num[0][0]=5;
        // num[0][1]=9;
        // num[1][0]=1;
        // num[1][1]=3;
        // num[2][0]=7;
        // num[2][1]=4;

        int num[][] = {
                { 5, 9 }, 
                { 1, 3 },
                { 7, 4 }
        };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
