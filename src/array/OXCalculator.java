package array;

import java.util.Scanner;

public class OXCalculator {

    private static int solution(int n, int[] arr) {

        int[] score = new int[n + 1]; //n보다 1 크게 배열 생성
        score[0] = 0; //첫 번째 자리는 0으로 미리 초기화해둠.
        int answer = 0;

        for (int i = 1; i <= n; i++) { // 1부터 n까지 돈다.
            if (arr[i - 1] == 1) { //arr[i-1] 이 1이면
                score[i] = score[i - 1] + 1; //이전 값에 +1 해서 저장.
            } else {
                score[i] = 0; //만약 0이면 0으로 초기화
            }
        }

        for (int x : score) {
            answer += x;
        }


        return answer;

    }

    private static int solution2(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution2(n, arr));

    }
}
