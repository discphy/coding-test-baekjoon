package class2;

import java.io.IOException;
import java.util.*;

// 2108 통계학
public class _2108 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(kb.nextInt());
        }

        Collections.sort(list);

        int sum = 0;
        int center = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int frequency = Integer.MIN_VALUE;
        List<Integer> listFrequency = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += list.get(i);

            if (list.get(i) > max) {
                max = list.get(i);
            }

            if (list.get(i) < min) {
                min = list.get(i);
            }

            if (i == n / 2) {
               center = list.get(i);
            }

            int temp = map.getOrDefault(list.get(i), 0) + 1;

            if (temp > frequency) {
                frequency = temp;
                listFrequency.clear();
                listFrequency.add(list.get(i));
            } else if (temp == frequency) {
                listFrequency.add(list.get(i));
            }

            map.put(list.get(i), temp);
        }

        sb.append(Math.round((float) sum / n)).append("\n");
        sb.append(center).append("\n");

        if (listFrequency.size() > 1) {
            sb.append(listFrequency.get(1)).append("\n");
        } else {
            sb.append(listFrequency.get(0)).append("\n");
        }

        sb.append(max - min).append("\n");

        System.out.println(sb);
    }
}