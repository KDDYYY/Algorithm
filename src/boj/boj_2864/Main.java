package boj.boj_2864;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int maxA;
        int maxB;

        int minA;
        int minB;

        //A영역
        if (A.contains("5") && A.contains("6")) {
            A = A.replace("6", "5");
            minA = Integer.parseInt(A);
            A = A.replace("5", "6");
            maxA = Integer.parseInt(A);
        } else if (A.contains("5")) {
            minA = Integer.parseInt(A);
            A = A.replace("5", "6");
            maxA = Integer.parseInt(A);
        } else if (A.contains("6")) {
            maxA = Integer.parseInt(A);
            A = A.replace("6", "5");
            minA = Integer.parseInt(A);
        } else {
            int i = Integer.parseInt(A);
            maxA = i;
            minA = i;
        }


        //B영역
        if (B.contains("5") && B.contains("6")) {
            B = B.replace("6", "5");
            minB = Integer.parseInt(B);
            B = B.replace("5", "6");
            maxB = Integer.parseInt(B);
        } else if (B.contains("5")) {
            minB = Integer.parseInt(B);
            B = B.replace("5", "6");
            maxB = Integer.parseInt(B);
        } else if (B.contains("6")) {
            maxB = Integer.parseInt(B);
            B = B.replace("6", "5");
            minB = Integer.parseInt(B);
        } else {
            maxB = Integer.parseInt(B);
            minB = Integer.parseInt(B);
        }


        System.out.print((minA + minB) + " " + (maxA + maxB));

    }
}
