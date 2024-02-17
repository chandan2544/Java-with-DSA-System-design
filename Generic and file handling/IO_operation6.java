// BufferedWriter is more reliable provide support which is used with the FileWriter 

import java.io.*;

public class IO_operation6 {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJAVA");
        File file = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write("PW");
        bw.newLine();
        char ch[] = { 'p', 'w', 's', 'j' };
        bw.write(ch);

        bw.close();
        bw.flush();
    }
}
