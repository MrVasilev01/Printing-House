package org.Project_1_1.Shop;

import org.Project_1_1.Exception.ZeroPaperLoadException;
import org.Project_1_1.Paper.PaperType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintingMachineTest {
    private PrintingMachine printingMachine;

    @BeforeEach
    void init(){
        printingMachine = new PrintingMachine(1000, 10, true);
    }

    @Test
    void printException() throws ZeroPaperLoadException {
        printingMachine.loadMachine(PaperType.REGULAR);

        printingMachine.print(PaperType.REGULAR);

        assertThrows(ZeroPaperLoadException.class,() -> printingMachine.print(PaperType.REGULAR));
    }
}