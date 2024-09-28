package class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _4949 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String text = kb.nextLine();

            if (text.equals(".")) {
                break;
            }

            list.add(text);
        }

        for (String input : list) {
            System.out.println(validate(input));
        }
    }

    private static String validate(String input) {
        String answer = "yes";

        if (!input.contains("(") && !input.contains("[") && !input.contains(")") && !input.contains("]")) {
            return "yes";
        }

        Stack<Character> stack = new Stack<>();

        for (Character c : input.toCharArray()) {
            if (c != '(' && c != ')' && c != '[' && c != ']') {
                continue;
            }

            if (c == '(' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return "no";
                }

                Character peek = stack.peek();

                if ((peek == '(' && c == ')') || (peek == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return "no";
                }
            }
        }

        if (!stack.isEmpty()) {
            return "no";
        }

        return answer;
    }
}