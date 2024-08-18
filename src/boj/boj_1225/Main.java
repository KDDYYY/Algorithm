package boj.boj_1225;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();

        long anw = 0;

        for (int i = 0; i < A.length(); i++) {
            for (int t = 0; t < B.length(); t++) {
                anw += Long.parseLong(String.valueOf(A.charAt(i))) * Long.parseLong(String.valueOf(B.charAt(t)));
            }
        }

        System.out.println(anw);
    }
}