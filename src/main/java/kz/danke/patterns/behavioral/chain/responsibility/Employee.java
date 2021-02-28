package kz.danke.patterns.behavioral.chain.responsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    private final String role;
    private final LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (!processRequest(application) && successor != null) {
            this.successor.processLeaveApplication(application);
        }
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    protected abstract boolean processRequest(LeaveApplication application);
}