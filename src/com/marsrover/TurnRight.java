package com.marsrover;

public class TurnRight implements RoverCommand {

    MarsRover marsRover;

    public TurnRight(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void execute() {
        marsRover.turnRight();
    }
}
