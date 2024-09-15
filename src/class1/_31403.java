package class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _31403 {

    public static void main(String[] args) {
        _31403 T = new _31403();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        for (Integer n : T.solution(a, b, c)) {
            System.out.println(n);
        }
    }

    public List<Integer> solution(int a, int b, int c) {
        List<Integer> answer = new ArrayList<>();
        String d = "";

        d += a;
        d += b;

        answer.add(a + b - c);
        answer.add(Integer.parseInt(d) - c);

        return answer;
    }
}
