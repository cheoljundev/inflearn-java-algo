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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(solution(cnt, str));
    }
}
