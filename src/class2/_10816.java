package class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 10816 숫자 카드 2
public class _10816 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int input = kb.nextInt();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        int m = kb.nextInt();
        int[] arrM = new int[m];

        for (int i = 0; i < m; i++) {
            arrM[i] = kb.nextInt();
        }

        for (int i : arrM) {
            sb.append(map.getOrDefault(i, 0)).append(" ");
        }

        System.out.println(sb);
    }
}