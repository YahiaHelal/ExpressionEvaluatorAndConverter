package Application;

import Model.Expression;
import Model.ExpressionConverter;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("dasdasd");
        ExpressionConverter expressionConverter = new ExpressionConverter();
        Expression expression = new Expression("(a+b    )())(^(a+b*c)");
        System.out.println(expressionConverter.infixToPostfix(expression));
        System.out.println(expression.isBalanced());
        System.out.println(expression);
    }
}