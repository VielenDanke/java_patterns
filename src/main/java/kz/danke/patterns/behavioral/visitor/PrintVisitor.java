package kz.danke.patterns.behavioral.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Programmer programmer) {
        String msg = String.format("%s is a %s %s.\n",
                programmer.getName(),
                programmer.getSkill(),
                programmer.getClass().getSimpleName()
        );
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        String msg = String.format("%s is a %s with %d programmers reporting.\n",
                projectLead.getName(),
                projectLead.getClass().getSimpleName(),
                projectLead.getDirectReports().size()
        );
        System.out.println(msg);
    }

    @Override
    public void visit(Manager manager) {
        String msg = String.format("%s is a %s with %d leads reporting.\n",
                manager.getName(),
                manager.getClass().getSimpleName(),
                manager.getDirectReports().size()
        );
        System.out.println(msg);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String msg = String.format("%s is a %s with %d managers reporting.\n",
                vicePresident.getName(),
                vicePresident.getClass().getSimpleName(),
                vicePresident.getDirectReports().size()
        );
        System.out.println(msg);
    }
}
