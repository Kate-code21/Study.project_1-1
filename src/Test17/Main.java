package Test17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayStr = new String[5];
        int[] numb = new int[5];

        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader.readLine();
            numb[i] = arrayStr[i].length();
        }
      /*  }
        for(int i = 0; i < numb.length; i++) {*/
        for(int i = 0; i < numb.length; i++) {
            System.out.println(i+". "+numb[i]);
        }
    }
}
