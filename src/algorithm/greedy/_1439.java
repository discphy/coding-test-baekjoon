package algorithm.greedy;

import java.io.IOException;
import java.util.Scanner;

// 1439 뒤집기
public class _1439 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int answer = 0;

        String n = kb.next();

        int grouping0 = 0;
        int grouping1 = 0;

        char temp = '2';

        for (char c : n.toCharArray()) {
            if (temp != c) {
                if (c == '0') {
                    grouping0++;
                } else if (c == '1') {
                    grouping1++;
                }
            }

            temp = c;
        }

        answer = Math.min(grouping0, grouping1);

        System.out.println(answer);
    }
}