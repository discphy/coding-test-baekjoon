package class2;

import java.io.IOException;
import java.util.Scanner;

// 1929 소수 구하기
public class _1929 {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[m + 1];

        for (int i = 2; i <= m; i++) {
            if (arr[i] != 0) continue;
            for (int j = i; j <= m; j += i) {
                arr[j] = 1;
            }
            if (i >= n) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}