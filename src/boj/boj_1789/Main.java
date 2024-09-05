package boj.boj_1789;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long S = scan.nextLong();

        long sum = 0;
        int cnt = 0;

        while (true) {
            sum += cnt;

            if (sum > S) break;
            cnt++;
        }
        System.out.print(--cnt);
    }
}

