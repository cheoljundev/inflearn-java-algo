package sec1;

import java.util.Scanner;

public class PalindromeStringChecker {

    public static String solution(String str) {

        str = str.toLowerCase().replaceAll("[^a-z]", "");
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return "YES";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(solution(str));

    }
}
