package boj.boj_10816;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Integer, Integer> sang = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            sang.putIfAbsent(s, 0);
            sang.put(s, sang.get(s) + 1);
        }

        int M = sc.nextInt();
        int[] list = new int[M];
        for (int i = 0; i < M; i++) {
            list[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for (int i : list) {
            if (!sang.containsKey(i)) sb.append(0).append(" ");
            else sb.append(sang.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
