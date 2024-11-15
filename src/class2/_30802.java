package class2;

import java.util.Scanner;

//30802 웰컴 키트
public class _30802 {

    public static void main(String[] args) {
        _30802 T = new _30802();
        Scanner kb = new Scanner(System.in);
        int i = kb.nextInt();
        int[] arr = new int[6];

        for (int j = 0; j < 6; j++) {
            arr[j] = kb.nextInt();
        }

        int t = kb.nextInt();
        int p = kb.nextInt();

        T.tshirt(arr, t);
        T.pen(i, p);
    }

    public void tshirt(int[] arr, int t) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = arr[i] / t;
            int x = arr[i] % t;

            sum += count + (x == 0 ? 0 : 1);
        }

        System.out.println(sum);
    }

    public void pen(int i, int p) {
        int grp = i / p;
        int single = i % p;

        System.out.println(grp + " " + single);
    }
}
