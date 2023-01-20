package lesson;

import java.util.Scanner;

public class EqualsExam {
    public static void main(String[] args) {
        String name1 = "가영";
        Scanner sc = new Scanner(System.in);
        String name2 =  sc.nextLine();

        String name3 = "가영";

        if(name1.equals(name2)){
            System.out.println("0");
        }

        if (name1 == name3) {
            System.out.println("동일");
        }

        if (name1.equals(name3)) {
            System.out.println("동일");
        }
    }
}
