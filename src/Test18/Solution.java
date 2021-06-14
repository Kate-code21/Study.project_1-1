package Test18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int[] num1 = new int[5];
        int[] num2 = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < numbers.length - 5; i++) {
            num1[i] = numbers[i];
        }
        for (int i = 5; i < numbers.length; i++) {
            num2[i - 5] = numbers[i];
            System.out.println(num2[i - 5]);
        }
    }
}
