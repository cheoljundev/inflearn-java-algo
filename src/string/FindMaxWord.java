package string;

import java.util.Scanner;

public class FindMaxWord {

    public static String solution1(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for (String x : s) {
            int len = x.length();
            if (len > m){
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public static String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        String[] s = str.split(" ");

        while ((pos = str.indexOf(" ")) != -1) {
            // he studies hard
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if (str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //String answer = solution1(str);
        String answer = solution2(str);

        System.out.println(answer);
    }
}
