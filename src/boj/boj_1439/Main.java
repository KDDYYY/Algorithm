package boj.boj_1439;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String[] list = new String[S.length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = String.valueOf(S.charAt(i));
        }

        int cnt = 0;
        int oneanw = 0;
        int zeroanw = 0;

        String equal = list[0];

        while (true) {
            if (!equal.equals(list[cnt + 1])) {
                if (equal.equals("0")) { //0에서 1로 바뀐 횟수
                    zeroanw++;
                } else if (equal.equals("1")) {
                    oneanw++; //1에서 0으로 바뀐 횟수
                }
                equal = list[cnt + 1];
            }
            cnt++;
            if (cnt == S.length() - 1) break;
        }

        int result = Math.max(oneanw, zeroanw);
        System.out.print(result);

    }
}

