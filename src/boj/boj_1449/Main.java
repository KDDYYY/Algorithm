package boj.boj_1449;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int L = scan.nextInt();

        int[] pipe = new int[N];

        for (int i = 0; i < N; i++) {
            pipe[i] = scan.nextInt();
        }
        Arrays.sort(pipe);

        double start = pipe[0] - 0.5;

        int anw = 1;

        for (int i = 0; i < N; i++) {
            if (start + L < pipe[i]) {
                start = pipe[i] - 0.5;
                anw++;
            }
        }
        System.out.print(anw);
    }
}