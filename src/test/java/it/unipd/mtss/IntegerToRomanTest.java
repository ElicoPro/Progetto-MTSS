////////////////////////////////////////////////////////////////////
// Elico Huang 2147952
// Giovanni Veronese 2145589
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest 
{
    @Test
    public void convert_1_to_I()
    {
        int input = 1;
        String result = IntegerToRoman.convert(input);
        assertEquals("I", result);
    }

    @Test
    public void convert_2_to_II()
    {
        int input = 2;
        String result = IntegerToRoman.convert(input);
        assertEquals("II", result);
    }

    @Test
    public void convert_3_to_III()
    {
        int input = 3;
        String result = IntegerToRoman.convert(input);
        assertEquals("III", result);
    }

    @Test
    public void convert_4_to_IV()
    {
        int input = 4;
        String result = IntegerToRoman.convert(input);
        assertEquals("IV", result);
    }

    @Test
    public void convert_5_to_V()
    {
        int input = 5;
        String result = IntegerToRoman.convert(input);
        assertEquals("V", result);
    }

    @Test
    public void convert_6_to_VI()
    {
        int input = 6;
        String result = IntegerToRoman.convert(input);
        assertEquals("VI", result);
    }

    @Test
    public void convert_9_to_IX()
    {
        int input = 9;
        String result = IntegerToRoman.convert(input);
        assertEquals("IX", result);
    }

    @Test
    public void convert_10_to_X()
    {
        int input = 10;
        String result = IntegerToRoman.convert(input);
        assertEquals("X", result);
    }

    @Test
    public void convert_14_to_XIV()
    {
        int input = 14;
        String result = IntegerToRoman.convert(input);
        assertEquals("XIV", result);
    }

    @Test
    public void convert_40_to_XL()
    {
        int input = 40;
        String result = IntegerToRoman.convert(input);
        assertEquals("XL", result);
    }

    @Test
    public void convert_50_to_L()
    {
        int input = 50;
        String result = IntegerToRoman.convert(input);
        assertEquals("L", result);
    }

    @Test
    public void convert_90_to_XC()
    {
        int input = 90;
        String result = IntegerToRoman.convert(input);
        assertEquals("XC", result);
    }

    @Test
    public void convert_100_to_C()
    {
        int input = 100;
        String result = IntegerToRoman.convert(input);
        assertEquals("C", result);
    }

    @Test
    public void convert_400_to_CD()
    {
        int input = 400;
        String result = IntegerToRoman.convert(input);
        assertEquals("CD", result);
    }

    @Test
    public void convert_500_to_D()
    {
        int input = 500;
        String result = IntegerToRoman.convert(input);
        assertEquals("D", result);
    }

    @Test
    public void convert_900_to_CM()
    {
        int input = 900;
        String result = IntegerToRoman.convert(input);
        assertEquals("CM", result);
    }

    @Test
    public void convert_1000_to_M()
    {
        int input = 1000;
        String result = IntegerToRoman.convert(input);
        assertEquals("M", result);
    }

    @Test
    public void convert_58_to_LVIII()
    {
        int input = 58;
        String result = IntegerToRoman.convert(input);
        assertEquals("LVIII", result);
    }

    @Test
    public void convert_336_to_CCCXXXVI()
    {
        int input = 336;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCXXXVI", result);
    }

    @Test
    public void convert_753_to_DCCLIII()
    {
        int input = 753;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCLIII", result);
    }

    @Test
    public void convert_359_to_CCCLIX()
    {
        int input = 359;
        String result = IntegerToRoman.convert(input);
        assertEquals("CCCLIX", result);
    }

    @Test
    public void convert_449_to_CDXLIX()
    {
        int input = 449;
        String result = IntegerToRoman.convert(input);
        assertEquals("CDXLIX", result);
    }

    @Test
    public void convert_888_to_DCCCLXXXVIII()    // PORTAFORTUNA
    {
        int input = 888;
        String result = IntegerToRoman.convert(input);
        assertEquals("DCCCLXXXVIII", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_0_throwsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_over1000_throwsException() {
        IntegerToRoman.convert(1001);
    }
}
