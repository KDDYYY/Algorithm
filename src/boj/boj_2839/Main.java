package boj.boj_2839;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int bong = 0;

        while (true) {
            if (N % 5 == 0) {
                bong += N / 5;
                System.out.println(bong);
                break;
            } else {
                N -= 3;
                bong++;
            }
            if (N < 0) {
                System.out.print(-1);
                break;
            }
        }
    }
}
