package boj.boj_2606;

import java.util.Scanner;

public class Main {
    //arr [][] = { {1, 2}, {2, 3}, {1, 5}, {5, 2}, {5, 6}, {4, 7} }

    static boolean[] check;
    static int[][] arr;
    static int count = 0, node, line;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        line = sc.nextInt();

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for(int i = 0; i < node; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            arr[A][B] = arr[B][A] = 1;
        }

        dfs(1);

        System.out.println(count - 1);

    }
    static void dfs(int start) {
        check[start] = true;
        count++;

        for(int i = 0 ; i <= node; i++) {
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }


}
