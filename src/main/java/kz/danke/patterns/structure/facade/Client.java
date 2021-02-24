package kz.danke.patterns.structure.facade;

import kz.danke.patterns.structure.facade.email.EmailFacade;

public class Client {

	public static void main(String[] args) {
		EmailFacade facade = new EmailFacade();
		Order order = new Order("101", 99.99);
		
//		boolean result = sendOrderEmailWithoutFacade(order);

		boolean result = facade.sendOrderEmail(order);

		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
	
}
