package boj.boj_11501;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            long[] cost = new long[N];
            for (int k = 0; k < N; k++) {
                cost[k] = sc.nextInt();
            }
            sb.append(max(cost)).append("\n");
        }
        System.out.println(sb);
    }

    static long max(long[] cost) {
        long sum = 0;
        long maxCost = cost[cost.length - 1];

        for (int i = cost.length - 1; i > 0; i--) {
            if (maxCost < cost[i - 1]) {
                maxCost = cost[i - 1];
                continue;
            }
            sum += (maxCost - cost[i - 1]);
        }
        return sum;
    }
}
