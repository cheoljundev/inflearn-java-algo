package array;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
