package sec1;

import java.util.Scanner;

public class NaturalNumberFilter {

    public static int solution(String str) {

        int answer = 0;

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            // 48 -> 0, 57 -> 9
            if (ch >= 48 && ch <= 57) {
                // 48은 0의 아스키번호. 숫자는 숫자+48이므로 48을 뺌으로 진짜 숫자가 됨.
                answer = answer * 10 + (ch - 48);
            }
        }

        return answer;

    }

    public static int solution2(String str) {

        String answer = "";

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                answer = answer += ch;
            }
        }

        return Integer.parseInt(answer);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(solution(str));

    }
}
