package sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConcatArray {
    private static int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n+m];
        System.arraycopy(arr1, 0, answer, 0, n);
        System.arraycopy(arr2, 0, answer, n, m);
        Arrays.sort(answer);
        return answer;
    }

    private static List<Integer> solution2(int n, int m, int[] arr1, int[] arr2) {

        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {

            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }

        }

        while (p1 < n) {
            answer.add(arr1[p1++]);
        }

        while (p2 < m) {
            answer.add(arr2[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : solution2(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
