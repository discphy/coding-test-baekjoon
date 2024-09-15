package class2;

import java.util.Scanner;

// 1436 영화감독 숌
public class _1436 {
    public static void main(String[] args) {
        _1436 T = new _1436();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();

        System.out.println(T.solution(a));
    }

    public int solution(int a) {
        int answer = 666;
        int count = 1;

        while (count != a) {
            answer++;
            if (String.valueOf(answer).contains("666")) {
                count++;
            }
        }

        return answer;
    }
}
