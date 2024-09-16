package class2;

import java.util.Scanner;

// 1676 팩토리얼 0의 개수
public class _1676 {
    public static void main(String[] args) {
        _1676 T = new _1676();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();

        System.out.println(T.solution(a));
    }

    public int solution(int a) {
        int answer = 0;

        while (a >= 5) {
            answer += a / 5;
            a /= 5;
        }

        return answer;
    }
}
