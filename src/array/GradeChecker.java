package array;

import java.util.Scanner;

public class GradeChecker {

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int grade = 1;
            int score = arr[i];

            for (int s : arr) {
                if (score < s) {
                    grade++;
                }
            }

            answer[i] = grade;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
