package boj.boj_15903;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        Queue<Long> math = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            math.offer(scan.nextLong());
        }

        for (int i = 0; i < m; i++) {
            long anw = math.poll() + math.poll();
            for (int t = 0; t < 2; t++) {
                math.offer(anw);
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += math.poll();
        }
        System.out.print(sum);
    }
}