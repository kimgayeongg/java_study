package lesson;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      int[] scoreArr = new int[n];

        for (int i = 0; i < n; i++) {
            scoreArr[i] = i;
        }
        System.out.println("scoreArr = " + Arrays.toString(scoreArr));

        for (int i = 0; i <n ; i++) {
            System.out.println(scoreArr[i]);

        }







    }
}
