package sec2;

import java.util.Scanner;

public class Fibonacci {

    private static int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }

    private static void solution2(int n) {
        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : solution(n)) {
            System.out.print(x + " ");
        }

        //solution2(n);

    }
}
