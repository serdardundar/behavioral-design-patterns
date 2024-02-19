package com.gh.sd.behavioralpatterns.interpreter;

public class Client {

    public static void main(String[] args) {
        Report report1 = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave", "USER","FINANCE_ADMIN");

        System.out.println("User access report:" + exp.interpret(user1));

        Report report2 = new Report("Payment report", "FINANCE_ADMIN AND USER");
        ExpressionBuilder builder2 = new ExpressionBuilder();
        PermissionExpression exp2 = builder2.build(report2);
        System.out.println(exp2);

        System.out.println("User access report:" + exp.interpret(user1));
    }

}
