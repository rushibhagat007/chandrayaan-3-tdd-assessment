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

	@Test
	public void testMoveForward() {
		Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
		c.moveForward();
		assertEquals("(0, 1, 0)", c.getPosition());
	}
	
	@Test
	public void testMoveBackward() {
		Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
		c.moveBackward();
		assertEquals("(0, -1, 0)", c.getPosition());
	}
	
	@Test
	public void testTurnLeft() {
		Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
		c.turnLeft();
		assertEquals('W', c.getDirection());
	}
	
	@Test
	public void testTurnRight() {
		Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
		c.turnRight();
		assertEquals('E', c.getDirection());
	}
	
	@Test
	public void testTurnUp() {
		Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
		c.turnUp();
		assertEquals(1, c.getZ());
	}
	
	@Test
	public void testTurnDown() {
		Chandrayaan3 c = new Chandrayaan3(0, 0, 0, 'N');
		c.turnDown();
		assertEquals(-1, c.getZ());
	}

}
