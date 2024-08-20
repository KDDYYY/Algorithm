package boj.boj_2217;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] rope = new int[N];
        for (int i = 0; i < N; i++) {
            rope[i] = scan.nextInt();
        }
        Arrays.sort(rope);
        int anw = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (i == N - 1) {
                anw = rope[i];
            } else {
                if (anw < rope[i] * (N - i)) {
                    anw = rope[i] * (N - i);
                }
            }
        }
        System.out.println(anw);
    }
}
