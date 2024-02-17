// this is  more optimized approach to read the data from files

import java.io.*;

public class IO_operation5 {
    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File file = new File("pw.txt");

        FileReader fr = new FileReader(file);

        char ch[] = new char[(int) file.length()];

        fr.read(ch);

        for (char data : ch) {
            System.out.print(data);
        }
    }
}
