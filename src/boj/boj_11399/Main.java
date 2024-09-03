package boj.boj_11399;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] list = new int[N];
        int[] anw = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += list[i];
            anw[i] = sum;
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += anw[i];
        }
        System.out.print(answer);
    }
}
