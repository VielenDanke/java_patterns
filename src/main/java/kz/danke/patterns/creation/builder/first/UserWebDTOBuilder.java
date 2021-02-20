package kz.danke.patterns.creation.builder.first;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = String.valueOf(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = String.format("%s, %s, %s, %s, %s",
                address.getHouseNumber(),
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getZipcode()
        );
        return this;
    }

    @Override
    public UserDTO build() {
        this.userWebDTO = new UserWebDTO(
                String.format("%s %s", this.firstName, this.lastName),
                this.address,
                this.age
        );
        return this.userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userWebDTO;
    }
}
