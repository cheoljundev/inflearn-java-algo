package array;

import java.util.*;

public class PickPresident {

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        List<List<Integer>> sharedClassmates = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sharedClassmates.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < n; k++) {
                    if (arr[i][j] == arr[k][j]) {
                        List<Integer> sharedClassmate = sharedClassmates.get(i);
                        if (!sharedClassmate.contains(k)) {
                            sharedClassmate.add(k);
                        }
                    }
                }
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> sharedClassmate = sharedClassmates.get(i);
            if (max < sharedClassmate.size()) {
                max = sharedClassmate.size();
                answer = i + 1;
            }
        }

        answer = answer == 0 ? 1 : answer;

        return answer;
    }

    private static int solution2(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) { //i: 대상 학생 탐색
            int cnt = 0;
            for (int j = 0; j < n; j++) { //j: 다른 학생 탐색
                for (int k = 0; k < 5; k++) { //k: 학년 탐색
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; // 한번 같은 반을 한 친구라면 다른 학년 확인은 더 이상 하지 않음.
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution2(n, arr));

    }
}
