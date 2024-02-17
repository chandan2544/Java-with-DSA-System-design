// here we learn about how to read or fetch data in files inside directories

import java.io.*;

public class IO_operation4 {
    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File file = new File( "pw.txt");

        FileReader fr = new FileReader(file);

        int i = fr.read();
        // System.out.println((char)i);

        while (i != -1) {
            System.out.print(i+" ----> ");
            System.out.println((char) i);
            i = fr.read();
        }
    }
}

