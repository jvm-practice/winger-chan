package com.maxwit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void testCalculate() {
        assertEquals(6, new App().calculate("1+2+3"));
    }
}

