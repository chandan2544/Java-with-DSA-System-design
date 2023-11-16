public class Array_initialize2 {
    public static void main(String[] args) {
        // when we do not know value 
        int marks[]=new int[4];
        marks[0]=5;
        marks[1]=4;
        marks[2]=3;
        marks[3]=7;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
