package boj.boj_2847;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] level = new int[N];

        for (int i = 0; i < N; i++) {
            level[i] = scan.nextInt();
        }

        int cnt = 0;

        for (int i = N - 1; i > 0; i--) {
            while (level[i - 1] >= level[i]) {
                level[i - 1]--;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}