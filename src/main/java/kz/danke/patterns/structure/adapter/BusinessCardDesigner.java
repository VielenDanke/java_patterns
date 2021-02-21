package kz.danke.patterns.structure.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        return String.format(
                "%s\n%s\n%s\n", customer.getName(), customer.getDesignation(), customer.getAddress()
        );
    }
}
