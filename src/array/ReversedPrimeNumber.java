package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedPrimeNumber {

    private static int[] solution(int[] arr) {
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

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isPrime(int result) {
        boolean isPrime = true;

        int sqrt = (int) Math.sqrt(result);

        if (result < 2) {
            isPrime = false;
        } else if (!(result == 2) && result % 2 == 0) {
            isPrime = false;
        }

        for (int j = 3; j <= sqrt; j+=2) {
            if (result % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
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
