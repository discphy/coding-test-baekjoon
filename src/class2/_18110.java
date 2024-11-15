package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 18110 solved.ac
public class _18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int exclude = (int) Math.round(n * 0.15);

        int[] arr = new int[n];

        for (int a = 0; a < n; a++) {
            arr[a] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int sum = 0;

        for (int a = exclude; a < n - exclude; a++) {
            sum += arr[a];
        }

        int size = n - 2 * exclude;

        int answer = (int) Math.round((double) sum / size);
        System.out.println(answer);
    }
}