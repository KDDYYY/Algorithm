package boj.boj_1448;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0, max = 0;
        // a+b>c

        for (int i = n - 1; i >= 2; i--) {
            int a = arr[i];
            int b = arr[i - 1];
            int c = arr[i - 2];

            if (arr[i] < arr[i - 1] + arr[i - 2]) {
                sum = a + b + c;
                if (max < sum) max = sum;
            }

        }

        if (sum == 0) bw.write(String.valueOf(-1));
        else bw.write(String.valueOf(max));

        bw.flush();
    }
}