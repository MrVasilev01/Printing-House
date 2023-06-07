package org.Project_1_1.Shop;

import org.Project_1_1.Paper.PaperSize;
import org.Project_1_1.Paper.PaperType;
import org.Project_1_1.Shop.Edition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditionTest {
    private Edition edition;

    @BeforeEach
    void init(){
        edition = new Edition("book","A",1, PaperType.REGULAR, PaperSize.A4, 10);
    }
    @Test
    void paperCostsWithPositiveNumber() {
        assertEquals(0.625, edition.paperCosts());
    }

    @Test
    void paperCostsWithZeroNumber() {
        edition = new Edition("book","A",1, PaperType.REGULAR, PaperSize.A4, 0);
        assertEquals(0.0625, edition.paperCosts());
    }
    @Test
    void paperCostsWithNegativeNumber() {
        edition = new Edition("book","A",1, PaperType.REGULAR, PaperSize.A4, -10);
        assertEquals(0.0625, edition.paperCosts());
    }
}