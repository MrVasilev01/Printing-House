package org.Project_1_1.Shop;

import org.Project_1_1.Employee.Employee;
import org.Project_1_1.Employee.EmployeeType;
import org.Project_1_1.Paper.PaperSize;
import org.Project_1_1.Paper.PaperType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintingHouseTest {
    private PrintingHouse printingHouse;
    private Employee operator;
    private Employee manager;
    private Edition edition;

    @BeforeEach
    void init(){
        printingHouse = new PrintingHouse("A",100,10);
        operator = new Employee("Az",100, EmployeeType.OPERATOR);
        manager = new Employee("Ti",200,EmployeeType.MANAGER);

        printingHouse.hireEmployee(operator);
        printingHouse.hireEmployee(manager);

        edition = new Edition("book","ABV",50, PaperType.REGULAR, PaperSize.A5,100);

    }

    @Test
    void costsForSalariesWithEmployees() {
        assertEquals(300,printingHouse.costsForSalaries());
    }
    @Test
    void costsForSalariesWithOutEmployees() {
        printingHouse.fireEmployee(operator);
        printingHouse.fireEmployee(manager);
        assertEquals(0,printingHouse.costsForSalaries());
    }


    @Test
    void getIncomeWithDiscount() {
        assertEquals(281.25,printingHouse.getIncome(edition));
    }
    @Test
    void getIncomeWithOutDiscount() {
        printingHouse.setDiscountThreshold(50);
        assertEquals(312.5,printingHouse.getIncome(edition));
    }
}