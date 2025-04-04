package sec2;

import java.util.Scanner;

public class Mountain {
    private static int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int top = i - 1 >= 0 ? arr[i - 1][j] : 0;
                int bottom = i + 1 < n ? arr[i + 1][j] : 0;
                int lt = j - 1 >=0 ? arr[i][j - 1] : 0;
                int rt = j + 1 < n ? arr[i][j + 1] : 0;

                int current = arr[i][j];

                if (current > top &&
                        current > bottom &&
                        current > lt &&
                        current > rt) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private static int solution2(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if (nx>=0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(solution2(n, arr));

    }
}
