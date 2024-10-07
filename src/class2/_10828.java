package class2;

import java.util.Scanner;
import java.util.Stack;

// 10828 스택
public class _10828 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arr = new String[n];
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = kb.next();

            if (input.equals("push")) {
                stack.push(kb.nextInt());
            } else if (input.equals("top")) {
                sb.append(!stack.isEmpty() ? stack.peek() : "-1").append("\n");
            } else if (input.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (input.equals("empty")) {
                sb.append(stack.isEmpty() ? "1" : "0").append("\n");
            } else if (input.equals("pop")) {
                sb.append(!stack.isEmpty() ? stack.pop() : "-1").append("\n");
            }
        }

        System.out.println(sb);
    }
}