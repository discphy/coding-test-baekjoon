package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class _10773 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            queue.add(s);
        }

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();

            if (poll == 0) {
                stack.pop();
            } else {
                stack.push(poll);
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}