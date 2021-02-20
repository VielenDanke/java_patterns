package kz.danke.patterns.creation.builder.second;

import kz.danke.patterns.creation.builder.first.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

	private String name;
	
	private String address;
	
	private String age;

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	public static UserDTOBuilder builder() {
		return new UserDTOBuilder();
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
	
	public static class UserDTOBuilder {
		private String firstName;
		private String lastName;
		private String age;
		private String address;
		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserDTOBuilder withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
			this.age = String.valueOf(ageInYears.getYears());
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			this.address = String.format("%s %s, %s, %s, %s",
					address.getHouseNumber(),
					address.getStreet(),
					address.getCity(),
					address.getState(),
					address.getZipcode()
			);
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			this.userDTO.setAddress(this.address);
			this.userDTO.setAge(this.age);
			this.userDTO.setName(String.format("%s %s", this.firstName, this.lastName));
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
