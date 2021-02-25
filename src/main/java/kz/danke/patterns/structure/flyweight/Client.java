package kz.danke.patterns.structure.flyweight;

import kz.danke.patterns.structure.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage f = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		String text = f.getText("4566");
		System.out.println(text);
		UserBannedErrorMessage u = ErrorMessageFactory.getInstance().getUserBannedMessage(null);
		System.out.println(u.getText("code"));
	}

}
