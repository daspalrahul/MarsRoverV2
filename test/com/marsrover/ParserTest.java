package com.marsrover;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parser() {
        MarsRover marsRover = Mockito.mock(MarsRover.class);
        Parser parser = new Parser(marsRover);

        ArrayList<RoverCommand> commandList =  parser.convertCommandStringToListOfExecutableCommands("L");

        assertEquals(TurnLeft.class, commandList.get(0).getClass());
    }
}