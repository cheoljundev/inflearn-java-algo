package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    private static int solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 2; i < n+1; i++) {
            answer.add(i);
        }

        for (int i = 2; i < n+1; i++) {
            for (int j = answer.size() - 1; j >= 0; j--) {
                int x = answer.get(j);
                if (i != x && x % i == 0) {
                    answer.remove(j);
                }
            }
        }

        return answer.size();
    }

    private static int solution2(int n) {
        boolean[] isPrime = new boolean[n+1];

        // 우선 전부 true로 설정 (2~n)
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 2부터 √n까지 배수 지우기
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        //소수 개수 찾기
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    private static int solution3(int n) {
        int answer = 0;
        int[] ch = new int[n+1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) { // ch[i] 값이 0이 아니면 무시
                answer++;
                for (int j = i; j <= n; j+=i) { // i의 배수를 모두 1로 만들어준다.
                    ch[j] = 1;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution3(n));

    }
}
