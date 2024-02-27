package com.incubyte.tdd.assessment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestChandrayaan3 {
	
	@Test
    public void testInitialPositionAndDirection() {
        Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
        assertEquals("(0, 0, 0)", c.getPosition());
        assertEquals('N', c.getDirection());
    }

}
