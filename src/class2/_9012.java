package class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _9012 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String text = kb.next();
            list.add(text);
        }

        for (String input : list) {
            System.out.println(validate(input));
        }
    }

    private static String validate(String input) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (Character c : input.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}