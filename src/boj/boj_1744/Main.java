package boj.boj_1744;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int in = scan.nextInt();
            if (in > 0)
                plus.add(in);
            else
                minus.add(in);
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        int cnt = 0;
        int sum = 0;

        while (cnt < plus.size()) {
            if (cnt + 1 < plus.size() && plus.get(cnt) != 1 && plus.get(cnt + 1) != 1)
                sum += plus.get(cnt++) * plus.get(cnt++);
            else
                sum += plus.get(cnt++);
        }

        cnt = 0;

        while (cnt < minus.size()) {
            if (cnt + 1 < minus.size())
                sum += minus.get(cnt++) * minus.get(cnt++);
            else
                sum += minus.get(cnt++);
        }

        System.out.println(sum);
    }
}
