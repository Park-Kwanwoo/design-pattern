package com.study.designpattern._03_behavioral_patterns._03_interpreter._04_my;

import java.util.Map;

// NonTerminal Expression
public class MinusExpression implements PrefixExpression {

    private PrefixExpression left, right;

    public MinusExpression(PrefixExpression left, PrefixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
