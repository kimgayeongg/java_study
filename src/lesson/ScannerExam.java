package lesson;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.next();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n" , num);

    }
}
