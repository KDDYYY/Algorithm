package boj.boj_11047;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int list[] = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = scan.nextInt();
        }

        int sum = 0;
        int cnt = 1;

        for (int i = 0; i < N; i++) {
            int c = K / list[N - cnt];
            sum += c;
            K = K - list[N - cnt] * c;
            cnt++;
        }
        System.out.print(sum);
    }
}
