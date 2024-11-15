package class2;

import java.util.Scanner;

//28702 FizzBuzz
public class _28702 {
    public static void main(String[] args) {
        _28702 T = new _28702();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        String c = kb.next();

        System.out.println(T.solution(a, b, c));
    }

    public String solution(String a, String b, String c) {
        int i = 0;

        if (isNumber(a)) {
            i = Integer.parseInt(a) + 3;
        }

        if (isNumber(b)) {
            i = Integer.parseInt(b) + 2;
        }

        if (isNumber(c)) {
            i = Integer.parseInt(c) + 1;
        }

        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0 && i % 5 != 0) {
            return "Fizz";
        } else if (i % 5 == 0 && i % 3 != 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }

    public boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
