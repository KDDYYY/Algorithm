package boj.boj_16953;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();
        int anw = 1;

        while (Long.parseLong(B) != Long.parseLong(A)) {

            if ((B.charAt(B.length() - 1) - '0' != 1 && Long.parseLong(B) % 2 != 0)
                    || Long.parseLong(B) < Long.parseLong(A)) {
                anw = -1;
                break;
            }

            if (B.charAt(B.length() - 1) - '0' == 1)
                B = B.substring(0, B.length() - 1);

            else
                B = String.valueOf(Long.parseLong(B) / 2);

            anw++;

        }

        System.out.println(anw);
    }
}
