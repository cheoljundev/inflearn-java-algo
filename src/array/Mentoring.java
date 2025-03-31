package array;

import java.util.Scanner;

public class Mentoring {

    private static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {        // 멘토 후보 i
            for (int j = 1; j <= n; j++) {    // 멘티 후보 j
                int cnt = 0;                  // i가 j보다 항상 등수 높은 횟수
                for (int k = 0; k < m; k++) { // 각 테스트에 대해
                    int pi = 0, pj = 0;       // i와 j의 등수 (0-based index)
                    for (int s = 0; s < n; s++) {
                        // 시험 k에서 등수 s에 해당하는 학생이 i면 pi에 등수 저장
                        if (arr[k][s] == i) pi = s;
                        // 시험 k에서 등수 s에 해당하는 학생이 j면 pj에 등수 저장
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++; // i가 j보다 등수가 높으면 (숫자가 작으면)
                }
                if (cnt == m) answer++; // 모든 테스트에서 i가 j보다 등수가 높으면
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));

    }

}
