// in this we learn about how to calculate no. of files inside the directories

import java.io.File;
import java.io.IOException;

public class IO_operation2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJAVA");
        // System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir is refering to directory PWJAVA : " + dir.isDirectory());

        File file = new File(dir, "pwSkill.txt");
        file.createNewFile();
        System.out.println("file is refering to pwskill.txt : " + file.isFile());

        int count = 0;
        File f = new File("PWJAVA");

        String str[] = f.list();

        for (String name : str) {
            count++;
            System.out.println(name);
        }
        System.out.println("no of files are : " + count);
    }

}
