package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 11650 좌표 정렬하기
public class _11650 {

    static class Coordintation implements Comparable<Coordintation> {

        public int x;
        public int y;

        public Coordintation(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public int compareTo(Coordintation o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }

    public static void main(String[] args) {
        _11650 T = new _11650();
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = kb.nextInt();
        List<Coordintation> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(new Coordintation(kb.nextInt(), kb.nextInt()));
        }

        Collections.sort(list);

        for (Coordintation coordintation : list) {
            sb.append(coordintation.x).append(" ").append(coordintation.y).append("\n");
        }

        System.out.println(sb);
    }
}