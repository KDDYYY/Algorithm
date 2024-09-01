package boj.boj_4796;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int index = 1;
        while (true){
            st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());   //L일 동안만 사용
            int P = Integer.parseInt(st.nextToken());   //연속하는 P 일
            int V = Integer.parseInt(st.nextToken());   //V일 짜리 휴가

            if(L == 0 && P == 0 && V == 0) break;

            int temp_1 = V / P;
            int temp_2 = Math.min(V % P, L);

            int anw = L*temp_1 + temp_2;

            sb.append("Case ").append(index).append(": ").append(anw).append("\n");
            index++;
        }
        System.out.println(sb);
    }
}