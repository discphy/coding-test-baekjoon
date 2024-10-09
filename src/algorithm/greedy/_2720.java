package algorithm.greedy;

import java.io.IOException;
import java.util.Scanner;

// 2720 세탁소 사장 동혁
public class _2720 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = kb.nextInt();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < n; i++) {
            int money = kb.nextInt();

            int quarterCount = money / quarter;
            money = money % quarter;

            int dimeCount = money / dime;
            money = money % dime;

            int nickelCount = money / nickel;
            money = money % nickel;

            int pennyCount = money / penny;

            sb.append(quarterCount).append(" ").append(dimeCount).append(" ").append(nickelCount).append(" ").append(pennyCount).append("\n");
        }

        System.out.println(sb);
    }
}