package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 2751 수 정렬하기 2
public class _2751 {
    public static void main(String[] args) {
        _2751 T = new _2751();
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = kb.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < a; i++) {
            list.add(kb.nextInt());
        }

        Collections.sort(list);

        for (Integer i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}