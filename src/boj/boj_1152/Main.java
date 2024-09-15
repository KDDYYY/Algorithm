package boj.boj_1152;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        StringTokenizer st = new StringTokenizer(A, " ");
        System.out.println(st.countTokens());
    }
}