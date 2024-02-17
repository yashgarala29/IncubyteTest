package org_test.example;

import org_test.example.CalculateTDD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTDDTest {
    @Test
    public void test1() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("");
        assertEquals("0",result);
    }
    @Test
    public void test2() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("1");
        assertEquals("1",result);
    }
    @Test
    public void test3() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("1,5");
        assertEquals("6",result);
    }
    @Test
    public void test4() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("1\\n2,3");
        assertEquals("6",result);
    }
    @Test
    public void test6() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("3,1\\n2");
        assertEquals("6",result);
    }
    @Test
    public void test5() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("1,\\n");
        assertEquals("Invalid Input",result);
    }
    @Test
    public void test7() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("//;\\n1;2");
        assertEquals("3",result);
    }

    @Test
    public void test8() {
        CalculateTDD calculateTDDTest=new CalculateTDD();
        String result=calculateTDDTest.add("-1,2,-4");
        assertEquals("negative numbers not allowed -1 -4",result);
    }
}
