package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 11866 요세푸스 문제 0
public class _11866 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int index = 0;

        while (queue.size() != 1) {
            index++;

            if (index == m) {
                sb.append(queue.poll()).append(", ");
                index = 0;
            } else {
                queue.offer(queue.poll());
            }
        }

        sb.append(queue.poll()).append(">");

        System.out.println(sb);
    }
}