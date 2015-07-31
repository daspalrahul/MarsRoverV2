package com.marsrover;


public class MarsRover {

    private int xCoordinate;
    private int yCoordinate;
    private String direction;

    public MarsRover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return xCoordinate + " " + yCoordinate + " " + direction;
    }

    public void turnLeft() {
        if (direction.equals("N"))
            direction = "W";
        else if (direction.equals("W"))
            direction = "S";
        else if (direction.equals("S"))
            direction = "E";
        else if (direction.equals("E"))
            direction = "N";
    }
}
