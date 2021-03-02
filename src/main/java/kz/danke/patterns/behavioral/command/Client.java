package kz.danke.patterns.behavioral.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command first = new AddMemberCommand("a@a.com", "spam", service);
		Command second = new AddMemberCommand("b@b.com", "unique", service);

		MailTasksRunner.getInstance().addCommand(first);
		MailTasksRunner.getInstance().addCommand(second);

		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}
