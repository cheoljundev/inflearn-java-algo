package sec2;

import java.util.Scanner;

public class RPSGame {

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int sub = arr1[i] - arr2[i];

            if (Math.abs(sub) == 2) {
                if (sub < 0) {
                    answer[i] = "A";
                } else {
                    answer[i] = "B";
                }
            }else if (sub < 0) {
                answer[i] = "B";
            } else if (sub > 0) {
                answer[i] = "A";
            } else if (sub == 0) {
                answer[i] = "D";
            }
        }

        return answer;
    }

    // chatgpt 제안
    private static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                answer[i] = "D"; // 무승부
            } else if ((arr1[i] == 1 && arr2[i] == 3) ||
                    (arr1[i] == 2 && arr2[i] == 1) ||
                    (arr1[i] == 3 && arr2[i] == 2)) {
                answer[i] = "A"; // A 승
            } else {
                answer[i] = "B"; // B 승
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (String s : solution2(n, arr1, arr2)) {
            System.out.println(s);
        }
    }
}
