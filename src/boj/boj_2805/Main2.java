package boj.boj_2805;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 나무의 수
        int M = sc.nextInt();  // 필요한 나무 길이

        int[] tree = new int[N];  // 나무 배열
        int max = 0;  // 가장 큰 나무의 높이를 저장할 변수

        // 나무 높이 입력받고, 가장 큰 나무의 높이 구하기
        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
            if (tree[i] > max) {
                max = tree[i];
            }
        }

        int low = 0;
        int high = max;  // 가장 큰 나무의 높이로 초기화
        int answer = 0;

        // 이분 탐색 시작
        while (low <= high) {
            int mid = (low + high) / 2;
            long total = 0;

            // 현재 절단기 높이에서 가져갈 수 있는 나무의 길이 계산
            for (int i = 0; i < N; i++) {
                if (tree[i] > mid) {
                    total += tree[i] - mid;
                }
            }

            // M미터 이상의 나무를 가져갈 수 있으면, 더 높은 절단 높이 시도
            if (total >= M) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
