package com.gh.sd.behavioralpatterns.interpreter;

// Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
