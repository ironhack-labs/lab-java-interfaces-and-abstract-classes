import employee.Employee;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private double commissionRate;

    //SalesPerson should have a constructor that accepts name, salary, supervisor, and commissionRate as parameters, in that order.
    public SalesPerson(String name, BigDecimal salary, Employee supervisor, double commissionRate) {
        super();
        this.commissionRate = commissionRate;
    }

    public SalesPerson(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Getter and setter for commissionRate
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    }