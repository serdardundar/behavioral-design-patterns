package com.gh.sd.behavioralpatterns.interpreter;

// Terminal permission
public class Permission implements PermissionExpression {

    private final String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
