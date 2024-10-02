package boj.boj_10815;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            hashSet.add(scan.nextInt());
        }

        int M = scan.nextInt();
        int[] check = new int[M];
        for (int i = 0; i < M; i++) {
            if (hashSet.contains(scan.nextInt())) {
                check[i] = 1;
                continue;
            } else {
                if (check[i] == 1) check[i] = 1;
                else check[i] = 0;
            }
        }

        for (int i = 0; i < check.length; i++) {
            System.out.print(check[i] + " ");
        }
        scan.close();
    }
}