package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {

    public static List<String> solution1(int n, String[] str) {
        List<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static List<String> solution2(int n, String[] str) {
        List<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s);

            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        for (String s : solution2(n, str)) {
            System.out.println(s);
        }

    }
}
