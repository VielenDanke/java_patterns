package kz.danke.patterns.structure.adapter;

import kz.danke.patterns.structure.adapter.cls.EmployeeClassAdapter;
import kz.danke.patterns.structure.adapter.obj.EmployeeObjectAdapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("Class Adapter ********");
        BusinessCardDesigner classDs = new BusinessCardDesigner();
        EmployeeClassAdapter customer = new EmployeeClassAdapter();
        populateEmployee(customer);
        String classCard = classDs.designCard(customer);
        System.out.println(classCard);
        System.out.println("Object Adapter ********");
        Employee employee = new Employee();
        populateEmployee(employee);
        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner objectDs = new BusinessCardDesigner();
        String objectCard = objectDs.designCard(adapter);
        System.out.println(objectCard);
    }

    private static void populateEmployee(Employee employee) {
        employee.setFullName("Vielen Danke");
        employee.setJobTitle("Software Developer");
        employee.setOfficeLocation("New York city");
    }
}
