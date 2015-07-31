package com.marsrover;


import org.junit.Test;
import org.mockito.Mockito;

public class MoveTest {

    @Test
    public void moveKnowsHowToMoveMarsRover() {
        MarsRover marsRover = Mockito.mock(MarsRover.class);
        Move move = new Move(marsRover);

        move.execute();

        Mockito.verify(marsRover).move();
    }

}