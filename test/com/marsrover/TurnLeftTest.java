package com.marsrover;


import org.junit.Test;
import org.mockito.Mockito;

public class TurnLeftTest {

    @Test
    public void moveKnowsHowToTurnTheMarsRoverLeft() {
        MarsRover marsRover = Mockito.mock(MarsRover.class);
        TurnLeft turnLeft = new TurnLeft(marsRover);

        turnLeft.execute();

        Mockito.verify(marsRover).turnLeft();
    }
}