package boj.boj_2075;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i< N*N ; i++){
            pq.offer(scan.nextInt());
        }
        for(int i = 0; i<N-1 ; i++){
            pq.poll();
        }
        System.out.print(pq.poll());
    }
}
