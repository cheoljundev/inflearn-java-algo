package sec1;

import java.util.Scanner;

public class StringCompression {

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        char[] chars = str.toCharArray();

        char before = '\0';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                before = chars[i];
                count = 1;
                answer.append(before);
            } else {
                if (before == chars[i]) {
                    count++;
                } else {
                    if (count != 1) {
                        answer.append(count);
                    }
                    before = chars[i];
                    count = 1;
                    answer.append(before);
                }
            }
        }

        if (count != 1) {
            answer.append(count);
        }


        return answer.toString();
    }

    private static String solution2(String str) {
        String answer = "";
        str += " ";

        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution2(str));

    }
}
