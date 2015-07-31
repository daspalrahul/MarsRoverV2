package com.marsrover;


import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {

    @Test
    public void marsRoverKnowsAboutItsLocationAndDirection() {
        MarsRover marsRover = new MarsRover(1, 2, "N");

        assertEquals("1 2 N", marsRover.toString());
    }

    @Test
    public void marsRoverKnowsHowToTurnLeftWhenFacingNorth() {
        MarsRover marsRover = new MarsRover(1, 2, "N");

        marsRover.turnLeft();

        assertEquals(new MarsRover(1, 2, "W").toString(), marsRover.toString());
    }

    @Test
    public void marsRoverKnowsHowToTurnLeftWhenFacingAnyDirection() {
        MarsRover marsRover = new MarsRover(1, 2, "W");

        marsRover.turnLeft();

        assertEquals(new MarsRover(1, 2, "S").toString(), marsRover.toString());
    }

    @Test
    public void marsRoverKnowsHowToTurnRightWhenFacingNorth() {
        MarsRover marsRover = new MarsRover(1, 2, "N");

        marsRover.turnRight();

        assertEquals(new MarsRover(1, 2, "E").toString(), marsRover.toString());
    }

}