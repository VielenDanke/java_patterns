package kz.danke.patterns.behavioral.template;

import java.io.IOException;
import java.util.UUID;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order(UUID.randomUUID().toString());
		order.addItem("Soda", 15);
		order.addItem("Sandwich", 10);
		order.addItem("Pizza", 17);

		OrderPrinter printer = new TextPrinter();
		OrderPrinter htmlPrinter = new HtmlPrinter();

		printer.printOrder(order, "1001.txt");
		htmlPrinter.printOrder(order, "html.txt");
	}
}
