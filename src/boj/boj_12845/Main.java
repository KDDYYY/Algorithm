package boj.boj_12845;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        List<Integer> card = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            card.add(scan.nextInt());
        }

        Collections.sort(card, Collections.reverseOrder());

        int anw = 0;
        while (card.size() != 1) {

            anw += card.get(0) + card.get(1);
            card.remove(1);
        }

        System.out.println(anw);
    }
}