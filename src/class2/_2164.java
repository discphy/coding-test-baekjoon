package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2164 카드2
public class _2164 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= a; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}