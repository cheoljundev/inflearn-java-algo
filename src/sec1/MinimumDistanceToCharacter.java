package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumDistanceToCharacter {

    public static List<Integer> solution(String s, char t) {
        List<Integer> distances = new ArrayList<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            int distance = 0;

            if (chars[i] == t) {
                distances.add(distance);
                continue;
            }

            int lt = i - 1;
            int rt = i + 1;

            while ((lt >= 0 && lt < i) || (rt <= chars.length - 1 && rt > i)) {

                distance++;

                if ((lt >= 0 && chars[lt] == t) || (rt <= chars.length - 1 && chars[rt] == t)) {
                    break;
                }

                lt--;
                rt++;
            }
            distances.add(distance);

        }

        return distances;
    }

    public static List<Integer> solution2(String s, char t) {
        List<Integer> answer = new ArrayList<>();
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer.add(p);
            } else {
                answer.add(++p);
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                answer.set(i, Math.min(answer.get(i), ++p));
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char t = sc.next().charAt(0);

        List<Integer> distances = solution2(s, t);

        for (int i = 0; i < distances.size(); i++) {
            System.out.print(distances.get(i));
            if (i != distances.size() - 1) {
                System.out.print(" ");
            }
        }

    }
}
