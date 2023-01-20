package lesson;

import java.util.Scanner;

public class OperatorExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>3 || num <7)
            System.out.println(num);
    }
}
