package boj.boj_1173;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       //운동을 N 분 할 떄
        int m = Integer.parseInt(st.nextToken());       //초기 맥박
        int M = Integer.parseInt(st.nextToken());       //최대 맥박
        int T = Integer.parseInt(st.nextToken());       //1분 운동 할때의 맥박 증가량
        int R = Integer.parseInt(st.nextToken());       //1분 쉴때의 맥박 감소량

        int mac = m;
        int min_time = 0;
        int exercise_time = 0;
        while (exercise_time < N) {
            min_time++;
            if (m + T > M) {
                min_time = -1;
                break;
            }
            if (mac + T <= M) {
                mac += T;
                exercise_time++;
            } else {
                if (mac - R < m) {
                    mac = m;
                } else {
                    mac -= R;
                }
            }
        }
        System.out.println(min_time);
    }
}
