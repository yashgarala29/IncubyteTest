package org_test.example;

import org_test.example.CalculateTDD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTDDTest {
    @Test
    public void test1() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        int result=calculateTDDTest.add("");
        assertEquals(0,result);

    }
}
