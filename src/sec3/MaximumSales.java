package sec3;

import java.util.Scanner;

public class MaximumSales {
    //작동하지만, Time Limit.
    private static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int[] pos = new int[k];
        for (int i = 0; i < k; i++) {
            pos[i] = i;
        }

        while (pos[k-1] < n) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[pos[i]++];
            }
            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    private static int solution2(int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution2(n, k, arr));

    }
}
