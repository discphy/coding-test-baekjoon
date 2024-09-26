package class2;

import java.util.Scanner;

// 2839 설탕 배달
public class _2839 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int answer = 0;

        while (a > 0) {
            if (a % 5 == 0) {
                answer += a / 5;
                a = 0;
                break;
            }
            answer++;
            a -= 3;
        }

        if (a < 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}