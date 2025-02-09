package string;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = str.chars()
                .map(ch -> {
                    if (Character.isLowerCase(ch)) {
                        return Character.toUpperCase(ch);
                    } else if (Character.isUpperCase(ch)) {
                        return Character.toLowerCase(ch);
                    } else {
                        return ch;
                    }
                })
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(result);
    }
}
