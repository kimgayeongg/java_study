package lesson;

import java.util.ArrayList;
import java.util.List;

public class ForEachExam {

    public static void main(String[] args) {
        List<Member> aList = new ArrayList<>();
        Member member = new Member("김가영", 10);
        aList.add(member);

        for (Member aMember : aList) {
            System.out.println(aMember.name);
            System.out.println(aMember.age);
        }

    }
}

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        //
    }
}