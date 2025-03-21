package string;

import java.util.Scanner;

public class Password {

    private static String solution(int cnt, String str) {
        StringBuilder answer = new StringBuilder();
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                binary.append("0");
            } else {
                binary.append("1");
            }
        }

        for (int i = 0, j = 0; i < cnt; i++, j+=7) {
            String substring = binary.substring(j, (j + 7));
            int key = Integer.parseInt(substring, 2);
            char ch = (char) key;
            answer.append(ch);
        }

        return answer.toString();

    }

    private static String solution2(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(solution2(cnt, str));
    }
}
