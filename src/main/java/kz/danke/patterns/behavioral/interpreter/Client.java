package kz.danke.patterns.behavioral.interpreter;

public class Client {

	public static void main(String[] args) {
		Report report = new Report("report", PermissionEnum.ADMIN);
		ExpressionBuilder builder = new ExpressionBuilder();
		PermissionExpression exp = builder.build(report);

		User user = new User("user", PermissionEnum.ADMIN);

		boolean isValid = exp.interpret(user);

		System.out.println(isValid);
	}

}
