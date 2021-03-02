package kz.danke.patterns.behavioral.interpreter;

public class Report {

	private String name;
	private PermissionEnum permission;
	
	public Report(String name, PermissionEnum permissions) {
		this.name = name;
		this.permission = permissions;
	}

	public String getName() {
		return name;
	}

	public PermissionEnum getPermission() {
		return permission;
	}
	
	
}
