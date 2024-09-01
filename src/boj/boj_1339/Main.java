package boj.boj_1339;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] alpha = new String[N];
        int[] num = new int[26];

        for (int i = 0; i < N; i++) {
            alpha[i] = scan.next();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < alpha[i].length(); j++) {
                num[alpha[i].charAt(j) - 'A'] += (Math.pow(10, alpha[i].length() - j - 1));
            }
        }

        Arrays.sort(num);

        int cnt = 9;
        int anw = 0;
        for (int i = 25; i >= 0; i--) {
            if (num[i] == 0)
                continue;
            anw += (num[i] * cnt);
            cnt--;
        }

        System.out.println(anw);

    }
}
