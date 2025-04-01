package sec3;

import java.util.Scanner;

public class MaximumSales {
    //작동하지만, Time Limit.
    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int[] pos = new int[m];
        for (int i = 0; i < m; i++) {
            pos[i] = i;
        }

        while (pos[m-1] < n) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += arr[pos[i]++];
            }
            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));

    }
}
