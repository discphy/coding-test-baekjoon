package class2;

import java.util.LinkedList;
import java.util.Scanner;

// 10845 큐
public class _10845 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String input = kb.next();

            if (input.equals("push")) {
                queue.offer(kb.nextInt());
            } else if (input.equals("front")) {
                sb.append(!queue.isEmpty() ? queue.peek() : "-1").append("\n");
            } else if (input.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.getLast()).append("\n");
                }
            } else if (input.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (input.equals("empty")) {
                sb.append(queue.isEmpty() ? "1" : "0").append("\n");
            } else if (input.equals("pop")) {
                sb.append(!queue.isEmpty() ? queue.poll() : "-1").append("\n");
            }
        }

        System.out.println(sb);
    }
}