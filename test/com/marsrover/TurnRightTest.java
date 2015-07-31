package com.marsrover;


import org.junit.Test;
import org.mockito.Mockito;

public class TurnRightTest {

    @Test
    public void moveKnowsHowToTurnTheMarsRoverRight() {
        MarsRover marsRover = Mockito.mock(MarsRover.class);
        TurnRight turnRight = new TurnRight(marsRover);

        turnRight.execute();

        Mockito.verify(marsRover).turnRight();
    }
}