package com.gh.sd.behavioralpatterns.interpreter;

//Non-terminal expression
public class OrExpression implements PermissionExpression {
	
	private final PermissionExpression expression1;
	private final PermissionExpression expression2;
	
	public OrExpression(PermissionExpression one, PermissionExpression two) {
		this.expression1 = one;
		this.expression2 = two;
	}

	@Override
	public boolean interpret(User user) {
		return expression1.interpret(user) || expression2.interpret(user);
	}
	
	@Override
	public String toString() {
		return expression1 +" OR "+expression2;
	}
}
