package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MarsRoverAppTest {

    @Test
    public void marsRoverAppKnowsHowToStartARoverAndPerformOperationsOnIt() {
        MarsRover marsRover = Mockito.mock(MarsRover.class);
        Parser parser = Mockito.mock(Parser.class);
        MarsRoverApp marsRoverApp = new MarsRoverApp(marsRover, parser, "L");

        Mockito.when(parser.convertCommandStringToListOfExecutableCommands("L")).thenReturn(new ArrayList<RoverCommand>(Arrays.asList(new TurnLeft(marsRover))));
        marsRoverApp.startRoverAndPerformOperations();

        Mockito.verify(marsRover).turnLeft();
    }
}