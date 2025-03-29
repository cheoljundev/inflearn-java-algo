package array;

import java.util.Scanner;

public class MaxLine {
    private static int solution(int n, int[] arr) {
        int answer = 0;

        //행 최대값 구하기
        for (int i = 0; i < arr.length; i+=n) {

            int tmp = 0;

            for (int j = 0; j < n; j++) {
                tmp += arr[i + j];
            }

            if (tmp > answer) {
                answer = tmp;
            }

        }

        //열 최대값 구하기
        for (int i = 0; i < n; i++) {

            int tmp = 0;

            for (int j = i; j < arr.length; j += n) {
                tmp += arr[j];
            }

            if (tmp > answer) {
                answer = tmp;
            }

        }

        //대각선 최대값 구하기
        for (int i = 0; i < n; i+=(n-1)) {

            int tmp = 0;

            //n+1, n-1씩.
            int addValue = i == 0 ? n + 1 : n - 1;

            for (int j = 0, k = i; j < n; j++, k += addValue) {
                tmp += arr[k];
            }

            if (tmp > answer) {
                answer = tmp;
            }
        }

        return answer;
    }

    private static int solution2(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;

        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] arr = new int[n*n];
        int[][] arr = new int[n][n];

        //sc.nextLine();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        /*
        for (int i = 0; i < n*n; i++) {
            arr[i] = sc.nextInt();
        }
        */

        System.out.println(solution2(n, arr));

    }
}
