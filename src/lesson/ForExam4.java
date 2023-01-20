package lesson;

public class ForExam4 {
    public static void main(String[] args) {
        // 나이 배열이 주어졌을 때, 22살 이상, 24살 이하의 수가 몇 개 존재하는지 구하시오!
        int[] ages = {30, 24, 25, 26, 22, 23};
       for(int i = 0; i<ages.length;i++){
           if(ages[i] >= 22 && 24 >= ages[i]){
               System.out.println(ages[i]);
           }
       }




    }
}
