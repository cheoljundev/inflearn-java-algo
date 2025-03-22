package array;

import java.util.Scanner;

public class GreaterThanPrevChecker {

    private static String solution(int n, int[] arr) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            Integer current = arr[i];

            if (i < 1) {
                answer += String.valueOf(current);
                answer += " ";
                continue;
            }

            int prev = arr[i - 1];

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

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
