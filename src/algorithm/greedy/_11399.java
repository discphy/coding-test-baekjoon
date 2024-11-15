package algorithm.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 11399 ATM
public class _11399 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            answer += sum;
        }

        System.out.println(answer);
    }
}