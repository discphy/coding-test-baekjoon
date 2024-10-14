package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 11651 좌표 정렬하기 2
public class _11651 {

    static class Coordination implements Comparable<Coordination> {

        public int x;
        public int y;

        public Coordination(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordination o) {
            if (this.y == o.y) {
                return this.x - o.x;
            }
            return this.y - o.y;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = kb.nextInt();
        List<Coordination> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(new Coordination(kb.nextInt(), kb.nextInt()));
        }

        Collections.sort(list);

        for (Coordination coordination : list) {
            sb.append(coordination.x).append(" ").append(coordination.y).append("\n");
        }
        System.out.println(sb);
    }
}