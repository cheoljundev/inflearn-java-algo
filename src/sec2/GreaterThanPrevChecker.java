package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreaterThanPrevChecker {

    private static List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer current = arr[i];

            if (i < 1) {
                answer.add(current);
                continue;
            }

            int prev = arr[i - 1];

            if (current > prev) {
                answer.add(current);
            }
        }

        return answer;
    }

    private static List<Integer> solution2(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
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

        for (int x : solution2(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
