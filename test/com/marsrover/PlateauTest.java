package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlateauTest {

    @Test
    public void plateauKnowsIfAPointIsInsideHimOrNot() {
        Plateau plateau = new Plateau(5, 5);

        assertEquals(true, plateau.isInsidePlateau(2,3));
    }
}