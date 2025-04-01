package sec3;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    private static int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n+m];
        System.arraycopy(arr1, 0, answer, 0, n);
        System.arraycopy(arr2, 0, answer, n, m);
        Arrays.sort(answer);
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

        for (int x : solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
