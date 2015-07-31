package com.marsrover;


import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {

    @Test
    public void marsRoverKnowsAboutItsLocationAndDirection() {
        MarsRover marsRover = new MarsRover(1, 2, "N");

        assertEquals("1 2 N", marsRover.toString());
    }

}