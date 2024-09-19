package class2;

import java.util.Scanner;

// 2869 달팽이는 올라가고 싶다
public class _2869 {

    public static void main(String[] args) {
        _2869 T = new _2869();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int v = kb.nextInt();

        System.out.println(T.solution(a, b, v));
    }

    public int solution(int a, int b, int v) {
        int answer;
        int distance = a - b;
        int destination = v - b;

        if (destination % distance != 0) {
            answer = destination / distance + 1;
        } else {
            answer = destination / distance;
        }

        return answer;
    }
}
