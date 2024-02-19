// PrintWriter IO operation

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IO_operation8 {
    public static void main(String[] args) throws Exception {
        File dir = new File("PWJAVA");
        File file = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("Java");
        pw.println(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();

    }
}
