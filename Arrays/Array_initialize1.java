public class Array_initialize1 {
    public static void main(String[] args) {
        // when we know values
        int marks[]={5,4,3,7};
        String name[]={"chandan","Aman","sourav","ashutosh"};

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(name[i]);
        }
    }
}