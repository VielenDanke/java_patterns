package kz.danke.patterns.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class User {

	private List<PermissionEnum> permissions;
	
	private String username;
	
	public User(String username, PermissionEnum... permissions) {
		this.username = username;
		this.permissions = new ArrayList<>();
		this.permissions.addAll(Arrays.asList(permissions));
	}

	public List<PermissionEnum> getPermissions() {
		return permissions;
	}

	public String getUsername() {
		return username;
	}
	
}
