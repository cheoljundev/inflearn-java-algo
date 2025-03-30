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
                    if (i != k && arr[i][j] == arr[k][j]) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));

    }
}
