package boj.boj_10610;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();

        int[] list = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            list[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        Arrays.sort(list);

        int anw = 0;
        for (int i = 0; i < N.length(); i++) {
            anw += Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        if (!N.contains("0") || anw % 3 != 0) {
            System.out.print(-1);
        } else {
            for (int i = 0; i < N.length(); i++) {
                System.out.print(list[(N.length() - 1) - i]);
            }
        }
    }
}
