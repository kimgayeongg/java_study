package lesson;

import java.util.Scanner;

public class SwitchExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade;
        if (score >= 90) grade = "A+";
        else if (score >= 80) grade = "A";
        else if (score >= 70) grade = "B+";
        else grade = "F";
        System.out.println(grade);

        switch (grade){
            case "A+" :
            case "A" :
                System.out.println("참 잘함");
                break;
            case "B+" :
                System.out.println("노력해라");
                break;
            default :
                System.out.println("공부해라");
        }

    }

}
