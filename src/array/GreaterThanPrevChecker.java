package array;

import java.util.Scanner;

public class GreaterThanPrevChecker {

    private static String solution(int n, String str) {
        String answer = "";

        String[] arr = str.split(" ");

        for (int i = 0; i < n; i++) {
            Integer current = Integer.valueOf(arr[i]);

            if (i < 1) {
                answer += String.valueOf(current);
                answer += " ";
                continue;
            }

            int prev = Integer.parseInt(arr[i - 1]);

            if (current > prev) {
                answer += String.valueOf(current);
                if (i < n - 1) {
                    answer += " ";
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(solution(n, str));
    }
}
