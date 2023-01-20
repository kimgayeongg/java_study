package lesson;

import java.util.Scanner;

public class ControlFlowIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        int sum =0;

        for (int i = 0; i <=score ; i++) {
//            sum =sum+i;
            sum+=i;
            if(i==10) break;

        }
        System.out.println("sum="+sum);

        if (score==100)
            System.out.println("good");
    else if (score>=80){
            System.out.println("bad");
        }



    }
}
