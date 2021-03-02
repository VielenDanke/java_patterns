package kz.danke.patterns.behavioral.interpreter;

//Non-terminal expression 
public class AndExpression implements PermissionExpression {

    private final PermissionExpression firstExpression;
    private final PermissionExpression secondExpression;

    public AndExpression(PermissionExpression firstExpression, PermissionExpression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(User user) {
        return firstExpression.interpret(user) && secondExpression.interpret(user);
    }
}
