// Deserialisation

import java.io.*;

class Cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;

    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class deserialization {
    public static void main(String[] args) throws Exception {

        // FileOutputStream fos=new FileOutputStream("pw.txt");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);
        // ObjectOutputStream oos=new ObjectOutputStream(bos);
        // oos.writeObject(c);
        // oos.flush();
        // oos.close();

        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();

        cr.disp();
        ois.close();
    }

}
