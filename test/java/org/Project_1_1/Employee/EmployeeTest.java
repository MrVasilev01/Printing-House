package org.Project_1_1.Employee;

import org.Project_1_1.Shop.PrintingHouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee operator;
    private Employee manager;

    @BeforeEach
    void init(){
        operator = new Employee("Niki", 100, EmployeeType.OPERATOR);
        manager = new Employee("Niki", 100, EmployeeType.MANAGER);
    }

    @Test
    void getBonusWithOperatorRevenueBiggerThenThreshold() {
        operator.getBonus(100,50);

        assertEquals(100,operator.getSalary());
    }
    @Test
    void getBonusWithOperatorThresholdBiggerThenRevenue() {
        operator.getBonus(50,100);

        assertEquals(100,operator.getSalary());
    }

    @Test
    void getBonusWithManagerRevenueBiggerThenThreshold() {
        manager.getBonus(100,50);

        assertEquals(110,manager.getSalary());
    }
    @Test
    void getBonusWithManagerThresholdBiggerThenRevenue() {
        manager.getBonus(50,100);

        assertEquals(100,manager.getSalary());
    }
}