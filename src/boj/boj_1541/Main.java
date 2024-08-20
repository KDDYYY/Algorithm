package boj.boj_1541;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String minus[] = scan.next().split("-");

        int anw = 0;
        for (int i = 0; i < minus.length; i++) {
            int sum = 0;
            String[] plus = minus[i].split("\\+");

            for (int t = 0; t < plus.length; t++) {
                sum += Integer.parseInt(plus[t]);
            }

            if (i == 0) {
                anw += sum;
            } else {
                anw -= sum;
            }
        }
        System.out.print(anw);
    }
}
