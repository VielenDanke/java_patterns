package kz.danke.patterns.behavioral.chainresponsibility;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		LeaveApprover approver = createChain();
		LeaveApplication leaveApplication = new LeaveApplication(LeaveApplication.Type.PTO, LocalDate.now(), LocalDate.now().plusDays(10));
		approver.processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		return new ProjectLead(manager);
	}
}
