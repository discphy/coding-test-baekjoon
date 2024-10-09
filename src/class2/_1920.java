package class2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 1920 수 찾기
public class _1920 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);

        int m = kb.nextInt();

        for (int i = 0; i < m; i++) {
            if (binarySearch(arr, kb.nextInt()) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int target) {
        int lt = 0;
        int rt = arr.length - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return -1;
    }


}