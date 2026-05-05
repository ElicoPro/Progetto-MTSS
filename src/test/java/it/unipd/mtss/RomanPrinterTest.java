////////////////////////////////////////////////////////////////////
// Elico Huang 2147952
// Giovanni Veronese 2145589
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanPrinterTest 
{

    @Test
    public void test_1_returns_ASCIART() 
    {
        int input = 1;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_5_returns_ASCIART() 
    {
        int input = 5;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_10_returns_ASCIART() 
    {
        int input = 10;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_50_returns_ASCIART() 
    {
        int input = 50;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_100_returns_ASCIART() 
    {
        int input = 100;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_500_returns_ASCIART() 
    {
        int input = 500;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_1000_returns_ASCIART() 
    {
        int input = 1000;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_4_returns_ASCIART() 
    {
        int input = 4;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_14_returns_ASCIART() 
    {
        int input = 14;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_58_returns_ASCIART() 
    {
        int input = 58;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_449_returns_ASCIART() 
    {
        int input = 449;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_888_returns_ASCIART() 
    {
        int input = 888;
        String result = RomanPrinter.print(input);
        assertNotNull(result);
        assertTrue(result.contains("_"));
    }

    @Test
    public void test_return_six_lines()
    {
        int input = 888;
        String result = RomanPrinter.print(input);
        String[] rows = result.split("\n");
        assertEquals(6, rows.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_0_throwsException() 
    {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_over1000_throwsException() 
    {
        RomanPrinter.print(1001);
    }

}