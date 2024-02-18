// buffered reader

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO_operation7 {
    public static void main(String[] args) throws IOException
    {
        File dir=new File("PWJAVA");
        File file=new File("pw.txt");

        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        
        String line=br.readLine();

        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }

    }
}

