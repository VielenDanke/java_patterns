package kz.danke.patterns.structure.adapter.obj;

import kz.danke.patterns.structure.adapter.Customer;
import kz.danke.patterns.structure.adapter.Employee;

public class EmployeeObjectAdapter implements Customer {

    private final Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getFullName();
    }

    @Override
    public String getAddress() {
        return this.employee.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return this.employee.getJobTitle();
    }
}
