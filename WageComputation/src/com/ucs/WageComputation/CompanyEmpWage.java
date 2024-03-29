package com.ucs.WageComputation;

public class CompanyEmpWage {
    public final String company;
    public final int emp_rate_per_hour;
    public final int num_of_working_days;
    public final int max_hrs_in_month;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int emp_rate_per_hour, int num_of_working_days, int max_hrs_in_month) {
        this.company = company;
        this.emp_rate_per_hour = emp_rate_per_hour;
        this.num_of_working_days = num_of_working_days;
        this.max_hrs_in_month = max_hrs_in_month;
        totalEmpWage = 0;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
    }
}
