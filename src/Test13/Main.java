package Test13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 15, 20, 25, 30};
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i]; // or summ += arr[i];
        }
        System.out.println(summ);
        Arrays.sort(arr);

        System.out.println("The smallest number is " + arr[0]);

    }
}
