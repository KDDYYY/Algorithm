package boj.boj_16173;

import java.util.Scanner;

public class Main {
    static boolean success = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] jelly = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                jelly[i][k] = sc.nextInt();
            }
        }

        dfs(0, 0, jelly);

        if (success) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    public static void dfs(int x, int y, int[][] jelly) {
        if (x < 0 || x >= jelly.length || y < 0 || y >= jelly.length) return;

        if (jelly[x][y] == -1) {
            success = true;
            return;
        }

        int moveCount = jelly[x][y];

        if (moveCount > 0) {
            dfs(x, y + moveCount, jelly); // 오른쪽
            dfs(x + moveCount, y, jelly); // 아래
        }
    }
}
