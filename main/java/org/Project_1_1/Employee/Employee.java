package org.Project_1_1.Employee;

public class Employee {
    private String name;
    private double salary;
    private EmployeeType employeeType;

    public Employee(String name, double salary,EmployeeType employeeType) {
        this.name = name;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }
    public void getBonus(double revenue,double threshold){
        if (employeeType == EmployeeType.MANAGER && revenue > threshold){
            this.salary = this.salary + (this.salary * 0.1);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
