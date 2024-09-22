package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 10814 나이순 정렬
public class _10814 {

    static class Member implements Comparable<Member> {

        public int age;
        public String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }


        @Override
        public int compareTo(Member o) {
            return this.age - o.age;
        }
    }

    public static void main(String[] args) {
        _10814 T = new _10814();
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = kb.nextInt();
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(new Member(kb.nextInt(), kb.next()));
        }

        Collections.sort(list);

        for (Member member : list) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }

        System.out.println(sb);
    }
}