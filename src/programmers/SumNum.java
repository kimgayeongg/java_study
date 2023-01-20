package programmers;

public class SumNum {
    public  static  int solution2(int num1 ,int num2){
    int answer =0;
    answer = num1-num2;
    return answer;
    }

    public static int solution(int num1 ,int num2){
        int answer =0;
        answer = num1+num2;
        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(2,3));
        System.out.println(solution2(6,3));
    }
}
