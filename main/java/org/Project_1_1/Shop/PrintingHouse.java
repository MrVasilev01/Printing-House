package org.Project_1_1.Shop;

import org.Project_1_1.Employee.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PrintingHouse {
    private String name;
    private int discountThreshold;
    private double discount;
    private List<Employee> employees;

    public PrintingHouse(String name,int discountThreshold, double discount) {
        this.name = name;
        this.discountThreshold = discountThreshold;
        this.discount = discount;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDiscountThreshold() {
        return discountThreshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscountThreshold(int discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    public boolean hireEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            return false;
        }
        return this.employees.add(employee);
    }

    public boolean fireEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            return this.employees.remove(employee);
        }
        return false;
    }

    public double costsForSalaries() {
        double sum = 0.0;
        for (Employee employee : this.employees) {
            sum = sum + employee.getSalary();
        }
        if (employees.size() == 0) {
            return 0;
        }
        return sum;
    }

    public double getIncome(Edition edition) {
        double sum = 0.0;
        double price = edition.paperCosts() * 2;
        if (edition.getNumber() < this.discountThreshold) {
            sum = (price - price * (this.discount / 100)) * edition.getNumber();
        } else {
            sum = price * edition.getNumber();
        }
        return sum;
    }

    public void writeToFile(Edition edition) {
        String filePath = "output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Printed editions: " + edition.toString() + "\n");
            writer.write("Income: " + getIncome(edition) + "\n");
            writer.write("Expenses: " + (edition.paperCosts() + costsForSalaries()) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "PrintingHouse{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
