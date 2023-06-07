package org.Project_1_1;

import org.Project_1_1.Employee.Employee;
import org.Project_1_1.Employee.EmployeeType;
import org.Project_1_1.Exception.ZeroPaperLoadException;
import org.Project_1_1.Paper.PaperSize;
import org.Project_1_1.Paper.PaperType;
import org.Project_1_1.Shop.Edition;
import org.Project_1_1.Shop.PrintingHouse;
import org.Project_1_1.Shop.PrintingMachine;

public class Main {
    public static void main(String[] args) throws ZeroPaperLoadException {
        PrintingHouse printingHouse1 = new PrintingHouse("Bulvest", 100,10);

        Employee operator = new Employee("Niki", 600, EmployeeType.OPERATOR);
        Employee manager = new Employee("Mitko", 1000, EmployeeType.MANAGER);

        printingHouse1.hireEmployee(operator);
        printingHouse1.hireEmployee(manager);

        System.out.println(printingHouse1.costsForSalaries());

        Edition edition1 = new Edition("book", "Az prokletnikyt", 150, PaperType.REGULAR, PaperSize.A5, 300);

        System.out.println(edition1.paperCosts());

        System.out.println(printingHouse1.getIncome(edition1));

        PrintingMachine printingMachine1 = new PrintingMachine(1000, 10, true);

        printingMachine1.loadMachine(PaperType.REGULAR);

        try {
            printingMachine1.print(PaperType.REGULAR);
        } catch (ZeroPaperLoadException e) {
            throw new RuntimeException(e);
        }

       /* try {
            printingMachine1.print(PaperType.REGULAR);
        } catch (ZeroPaperLoadException e) {
            throw new RuntimeException(e);
        }*/

        printingHouse1.writeToFile(edition1);
        printingHouse1.readFromFile("output.txt");
    }
}