package boj.boj_16112;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        long list[] = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = Long.parseLong(s[i]);
        }

        Arrays.sort(list);

        long anw = 0;

        for (int i = 0; i < k; i++) {
            anw += list[i] * i;
        }

        for (int i = n - 1; i > k - 1; i--) {
            anw += list[i] * k;
        }

        System.out.println(anw);
    }
}