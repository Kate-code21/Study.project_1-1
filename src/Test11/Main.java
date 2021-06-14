package Test11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        for (int i =0; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
