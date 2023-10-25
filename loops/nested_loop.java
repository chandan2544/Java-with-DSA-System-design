// square pattern in java  using  nested loop

public class nested_loop {
    public static void main(String[] args) {
        int n=4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
