package class1;

import java.util.Scanner;

public class _27866 {

    public static void main(String[] args) {
        _27866 T = new _27866();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();

        System.out.println(T.solution(s, n));
    }

    public char solution(String s, int n) {
        return s.charAt(n - 1);
    }
}
