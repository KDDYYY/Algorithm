package boj.boj_11726;

import java.io.*;
import java.util.*;

public class Main {
    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        System.out.println(size(N));
    }

    static int size(int N) {
        if (N == 1) return 1;
        if (N == 2) return 2;
        if (dp[N] != 0) return dp[N];
        return dp[N] = (size(N - 1) + size(N - 2)) % 10007;
    }
}