package boj.boj_1758;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }

        list.sort(Collections.reverseOrder());
        long anw = 0;

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i) - ((i + 1) - 1);
            if (temp <= 0)
                temp = 0;
            anw += temp;
        }

        System.out.println(anw);
    }
}
