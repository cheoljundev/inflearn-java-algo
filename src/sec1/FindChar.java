package sec1;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char t = Character.toUpperCase(sc.next().charAt(0));

        int answer = 0;

        answer = (int) str.chars().filter(ch -> ch == t).count();

        System.out.println(answer);
    }
}
