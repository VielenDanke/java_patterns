package kz.danke.patterns.behavioral.interpreter;

//Terminal expression
public class Permission implements PermissionExpression {

    private final PermissionEnum permission;

    public Permission(PermissionEnum permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission.name();
    }
}
