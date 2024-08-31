package boj.boj_23843;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        PriorityQueue<Long> con = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> outlet = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            con.offer(scan.nextLong());
        }
        scan.close();

        while (!con.isEmpty()) {
            if (outlet.size() < M) {
                outlet.offer(con.poll());
            } else {
                outlet.offer(con.poll() + outlet.poll());
            }
        }

        while (outlet.size() != 1) {
            outlet.poll();
        }
        System.out.println(outlet.poll());
    }
}