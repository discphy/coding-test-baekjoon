package class2;

import java.io.IOException;
import java.util.Scanner;

// 1654 랜선 자르기
public class _1654 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        long lt = 0;
        long rt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();

            if (arr[i] > rt) {
                rt = arr[i];
            }
        }

        rt++;
        
        while (lt < rt) {
            long mid = (lt + rt) / 2;

            long count = 0;

            for (int i = 0; i < n; i++) {
                count += arr[i] / mid;
            }

            if (count < m) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(lt - 1);
    }
}