package boj.boj_2805;

import java.io.*;
import java.util.*;
public class Main {
    static int N;
    static int M;
    static int[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        tree = new int[N];

        int anw;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree);

        int mid = N / 2;

        while (true) {
            int temp = 0;
            for (int i = mid + 1; i < N; i++) {
                temp += (tree[i] - tree[mid]);
            }
            if (temp < M)
                mid /= 2;
            else break;
        }

        anw = tree[mid + 1];
        while (true) {
            int temp = 0;
            for (int i = mid + 1; i < N; i++) {
                temp += (tree[i] - anw);
            }
            if (temp >= M) break;
            anw--;
        }
        System.out.println(anw);
    }
}
