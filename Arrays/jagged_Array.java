public class jagged_Array {
    public static void main(String[] args) {

        // jagged are  those arrays in which rows are not equal  to columns
        int num[][] = {
            { 5, 9 , 3, 6}, 
            { 1, 3 },
            { 7, 4, 8}
    };

    for (int i = 0; i <= 2; i++) {
        for (int j = 0; j < num[i].length; j++) {
            System.out.print(num[i][j] + " ");
        }
        System.out.println();
    }
    }
}
