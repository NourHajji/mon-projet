package com.esprit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddition() {
        assertEquals(5, new App().addition(2, 3));
    }
}
