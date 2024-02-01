// checked or unchecked Exception in java 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exceptional_handling9 {
    public static void main(String[] args) {
        int result = 7 / 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
