package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedPrimeNumber {

    private static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int result = 0;
            int n = arr[i];
            while (n > 0) {
                int digit = n % 10; //마지막 자리 추출
                result = result * 10 + digit; //결과에 자리 추가
                n /= 10;
            }

            boolean isPrime = isPrime(result);

            if (isPrime) {
                answer.add(result);
            }

        }

        return answer;
    }


    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }

    }
}
