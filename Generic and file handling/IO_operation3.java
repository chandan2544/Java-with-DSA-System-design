// here we learn about how to write or add data in files inside directories
// they are generally overriding in nature

import java.io.*;

public class IO_operation3 {
    public static void main(String[] args) throws IOException {
        File dir = new File("PW");

        File file = new File("pw.txt");
        // file.createNewFile(); // becoz we have to create file once

        FileWriter fw = new FileWriter(file,true);

        fw.write("PW");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = { 'j', 'a', 'v', 'a' };
        fw.write(ch);
        fw.write("\n");

        fw.close(); 
       // fw.flush(); 

        System.out.println("open pw.txt to see result");
    }
}
