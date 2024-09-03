package boj.boj_9237;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] tree = new Integer[n];
        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }

        Arrays.sort(tree, Collections.reverseOrder());

        int day = 1;
        int max = 0;
        for (Integer integer : tree) {
            if (max < integer + day) max = integer + day;
            day++;
        }
        System.out.println(max + 1);
    }
}
