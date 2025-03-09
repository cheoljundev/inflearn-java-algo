package string;

import java.util.Scanner;

public class PalindromeChecker {

    public static String solution1(String str) {
        String answer = "";

        str = str.toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static String solution2(String str) {
        String answer = "";

        str = str.toLowerCase();
        String copy = str;

        char[] chars = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            char tmp  = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
        }

        str = String.valueOf(chars);

        if (str.equals(copy)) {
            answer = "YES";
        } else {
            answer = "NO";
        }


        return answer;
    }

    public static String solution3(String str) {

        int len = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return "YES";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(solution3(str));

    }
}
