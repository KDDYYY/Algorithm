package boj.boj_2775;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] pe = new int[15][15];

        for (int p = 0; p < 15; p++) {
            pe[p][1] = 1;
            pe[0][p] = p;
        }

        for (int p = 1; p < 15; p++) {

            for (int q = 2; q < 15; q++) {
                pe[p][q] = pe[p][q - 1] + pe[p - 1][q];
            }
        }

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {

            int k = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(pe[k][n]);
        }
    }
}