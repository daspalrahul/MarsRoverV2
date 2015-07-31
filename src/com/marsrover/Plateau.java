package com.marsrover;


public class Plateau {

    private int xSize;
    private int ySize;

    public Plateau(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public boolean isInsidePlateau (int xCoordinate, int yCoordinate) {
        if (xCoordinate >=0 && xCoordinate <= xSize && yCoordinate >=0 && yCoordinate <= ySize)
            return true;
        return false;
    }
}
