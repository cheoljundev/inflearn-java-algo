package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedPrimeNumber {

    private static int[] solution(String[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            int lt = 0;
            int rt = chars.length - 1;

            while(lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;

                lt++;
                rt--;
            }

            int n = Integer.parseInt(String.valueOf(chars));

            boolean isPrime = isPrime(n);

            if (isPrime) {
                answer.add(n);
            }

        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;

        int sqrt = (int) Math.sqrt(n);

        if (n < 2) {
            isPrime = false;
        } else if (!(n == 2) && n % 2 == 0) {
            isPrime = false;
        }

        for (int j = 3; j <= sqrt; j+=2) {
            if (n % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }

    }
}
