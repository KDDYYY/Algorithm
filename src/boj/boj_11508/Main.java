package boj.boj_11508;

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
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (cnt == 2) {
                cnt = 0;
                continue;
            }

            anw += list.get(i);
            cnt++;
        }

        System.out.println(anw);
    }
}
