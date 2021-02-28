package kz.danke.patterns.behavioral.chain.responsibility;

import kz.danke.patterns.behavioral.chain.responsibility.LeaveApplication.Type;

public class Director extends Employee {

	public Director(LeaveApprover successor) {
		super("Director", successor);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		if(application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}
	
}
