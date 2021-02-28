package kz.danke.patterns.behavioral.chain.responsibility;

//A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // sick leave && days <= 2
        if (application.getType().equals(LeaveApplication.Type.Sick) && application.getNoOfDays() <= 2) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
