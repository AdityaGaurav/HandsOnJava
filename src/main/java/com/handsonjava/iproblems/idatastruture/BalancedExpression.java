package com.handsonjava.iproblems.idatastruture;

import java.util.Stack;

public class BalancedExpression {
    public static boolean isBalancedExpression(String input) {
        if (input == null) {
            System.out.println("Not a valid input");
        }
        if (input.trim().length() == 0) {
            System.out.println("Not avalid input");
            return false;
        }
        Stack<Character> inputStack = new Stack<>();
        char tmp;
        for (int i = 0; i < input.length(); i++) {
            tmp = input.charAt(i);
            if (tmp == '(' || tmp == '{' || tmp == '[') {
                inputStack.push(tmp);
            } else if (tmp == '}') {
                if (inputStack.isEmpty() || inputStack.pop() != '{') {
                    return false;
                }
            } else if (tmp == ')') {
                if (inputStack.isEmpty() || inputStack.pop() != '(') {
                    return false;
                }
            } else if (tmp == ']') {
                if (inputStack.isEmpty() || inputStack.pop() != '[') {
                    return false;
                }
            }
        }
//        if (inputStack.isEmpty()) {
//            return true;
//        }
//        return false;
        return inputStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalancedExpression("[{{[(){}]}}[]{}{{(())}}]"));
        System.out.println(isBalancedExpression("[{{[(){}]}}[]{}{({())}}]"));
    }
}
