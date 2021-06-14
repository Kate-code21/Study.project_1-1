package Test16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] arr = initializeArray();
        printArray(arr);
    }

    public static String[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];

        for (int i = 0; i < 8; i++) {
            arr[i] = reader.readLine();
        }
        return arr;
    }

    public static void printArray(String[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);

        }
    }
}


