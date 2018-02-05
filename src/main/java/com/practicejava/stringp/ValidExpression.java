package com.practicejava.stringp;

import java.util.Objects;
import java.util.Stack;

public class ValidExpression {
    public static boolean isValidExpression(String expression) {
        Objects.requireNonNull(expression);
        if (expression.trim().length() == 0) {
            return true;
        }
        Stack<Character> strings = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                strings.push(expression.charAt(i));
            } else {
//                try {
                if (expression.charAt(i) == ')') {
                    if (!(strings.size() == 0)) {
                        strings.pop();
                    }else {
                        return false;
                    }
                }
//                } catch (EmptyStackException e) {
//                    e.printStackTrace();
//                }
            }
        }
        return strings.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValidExpression(")1*2(+("));
    }
}
