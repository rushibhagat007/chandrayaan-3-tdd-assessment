package com.incubyte.tdd.assessment;

public class Chandrayaan3 {

	private int x;
	private int y;
	private int z;
	private char direction;

	public Chandrayaan3(int x, int y, int z, char direction) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}
	
	public String getPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

	public void moveForward() {
		switch (direction) {
		case 'N':
			y++;
			break;
		case 'S':
			y--;
			break;
		case 'E':
			x++;
			break;
		case 'W':
			x--;
			break;
		}
	}

	public void moveBackward() {
		switch (direction) {
		case 'N':
			y--;
			break;
		case 'S':
			y++;
			break;
		case 'E':
			x--;
			break;
		case 'W':
			x++;
			break;
		}
	}

	public void turnLeft() {
		switch (direction) {
		case 'N':
			direction = 'W';
			break;
		case 'W':
			direction = 'S';
			break;
		case 'S':
			direction = 'E';
			break;
		case 'E':
			direction = 'N';
			break;
		}
	}

	public void turnRight() {
		switch (direction) {
		case 'N':
			direction = 'E';
			break;
		case 'E':
			direction = 'S';
			break;
		case 'S':
			direction = 'W';
			break;
		case 'W':
			direction = 'N';
			break;
		}
	}

	public void turnUp() {
		z++;
	}

	public void turnDown() {
		z--;
	}

}
