package boj.boj_19941;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        String s = scan.next();

        Character[] ham = new Character[N];

        for (int i = 0; i < N; i++) {
            ham[i] = s.charAt(i);
        }

        int anw = 0;

        for (int i = 0; i < ham.length; i++) {
            if (ham[i] == 'P') {
                int start = Math.max(i - K, 0);
                int end = Math.min(i + K, N - 1);

                for (int k = start; k <= end; k++) {

                    if (ham[k] == 'H') {
                        anw++;
                        ham[k] = 'N';
                        break;
                    }
                }
            }
        }
        System.out.println(anw);
    }
}
