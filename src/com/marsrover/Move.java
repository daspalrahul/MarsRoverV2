package com.marsrover;


public class Move implements RoverCommand {

    MarsRover marsRover;

    public Move(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void execute() {
        marsRover.move();
    }
}
