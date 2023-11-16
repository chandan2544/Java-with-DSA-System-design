public class outOfBoundException {
    public static void main(String[] args) {
        int num[]={5,7,9,3};

        // Arrays out Of Bound Exception
        // System.out.println(num[4]);

        // you can use array length property
        // for (int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }

        // you can  for each loop
        for (int i : num) {
            System.out.println(i);
        }
    }
}
