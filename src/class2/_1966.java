package class2;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

// 1966 프린터 큐
public class _1966 {

    public static class Document {

        public final int rank;
        public final boolean isSearch;

        public Document(int rank, boolean isSearch) {
            this.rank = rank;
            this.isSearch = isSearch;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCase = kb.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = kb.nextInt();
            int m = kb.nextInt();

            LinkedList<Document> queue = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                queue.add(new Document(kb.nextInt(), j == m));
            }

            int count = 0;

            while (!queue.isEmpty()) {
                Document temp = queue.poll();
                boolean isMax = true;

                for (Document doc : queue) {
                    if (temp.rank < doc.rank) {
                        isMax = false;
                        break;
                    }
                }

                if (!isMax) {
                    queue.offer(temp);
                } else {
                    count++;
                    if (temp.isSearch) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}