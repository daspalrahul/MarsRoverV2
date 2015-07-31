package com.marsrover;


public class TurnLeft implements RoverCommand {

    MarsRover marsRover;

    public TurnLeft(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void execute() {
        marsRover.turnLeft();
    }
}
