package kz.danke.patterns.behavioral.chain.responsibility;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
