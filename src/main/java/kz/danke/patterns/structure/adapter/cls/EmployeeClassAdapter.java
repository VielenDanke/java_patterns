package kz.danke.patterns.structure.adapter.cls;

import kz.danke.patterns.structure.adapter.Customer;
import kz.danke.patterns.structure.adapter.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }
}
