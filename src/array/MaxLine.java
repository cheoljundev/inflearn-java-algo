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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*n];

        sc.nextLine();

        for (int i = 0; i < n*n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));

    }
}
