package sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonElements {

    private static List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {

        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n && p2 < m) {

            if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                p1++;
                answer.add(arr2[p2++]);
            }
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

        for (int x : solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
