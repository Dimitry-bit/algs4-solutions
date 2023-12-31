/* Write a stack client Parentheses that reads in a text stream from standard input
and uses a stack to determine whether its parentheses are properly balanced. For ex-
ample, your program should print true for [()]{}{[()()]()} and false for [(]). */

package prj.algs4.chapter1.section3;

import java.io.InputStream;
import java.util.Scanner;

public class Parentheses {

    private static char matchBracket(char c) {
        switch (c) {
            case '}':
                return '{';
            case '{':
                return '}';
            case ')':
                return '(';
            case '(':
                return ')';
            case ']':
                return '[';
            case '[':
                return ']';
        }

        assert (false);
        return '\0';
    }

    public static boolean isBalanced(String s) {
        StackResizingArray<Character> stack;
        stack = new StackResizingArray<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty() || (matchBracket(c) != stack.pop())) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static String readAll(InputStream source) {
        Scanner in = new Scanner(source);
        StringBuilder builder = new StringBuilder();
        while (in.hasNextLine()) {
            builder.append(in.nextLine());
        }
        in.close();
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = readAll(System.in);
        System.out.println(isBalanced(s));
    }
}
