package lesson;

import java.util.Scanner;

public class ControlFlowIf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println("score = " + score);

        if (score==100)
            System.out.println("good");
    else if (score>=80){
            System.out.println("bad");
        }



    }
}
