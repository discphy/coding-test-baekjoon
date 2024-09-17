package class2;

import java.util.Scanner;

public class _1978 {

    public static void main(String[] args) {
        _1978 T = new _1978();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr));
    }

    public int solution(int[] arr) {
        int answer = 0;
        int[] prime = new int[1001];

        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= 1000; j += i) {
                    prime[j] = 1;
                }
                prime[i] = 0;
            }
        }

        for (int i : arr) {
            if (i == 1) continue;
            if (prime[i] == 0) answer++;
        }

        return answer;
    }
}
