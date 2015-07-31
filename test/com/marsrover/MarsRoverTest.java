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
    public void foo() {
        MarsRover marsRover = new MarsRover(1, 2, "N");

        marsRover.turnLeft();

        assertEquals(new MarsRover(1, 2, "W").toString(), marsRover.toString());
    }

}