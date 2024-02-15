import java.io.*;

public class IO_operation1 {
    public static void main(String[] args) throws IOException {

        // File file = new File("pw.txt");
        // System.out.println(file.exists()); // false

        // file.createNewFile();
        // System.out.println(file.exists());  // true

        File dir=new File("PW");
        System.out.println(dir.exists()); //false

        dir.mkdir();
        System.out.println(dir.exists());  //true

    }
}
