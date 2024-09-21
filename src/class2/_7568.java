package class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 7569 덩치
public class _7568 {

    static class Physical {

        public int weight;
        public int height;

        public Physical(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = kb.nextInt();
        List<Physical> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(new Physical(kb.nextInt(), kb.nextInt()));
        }

        for (int i = 0; i < a; i++) {
            int rank = 1;
            for (int j = 0; j < a; j++) {
                if (list.get(i).weight < list.get(j).weight && list.get(i).height < list.get(j).height) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }
}