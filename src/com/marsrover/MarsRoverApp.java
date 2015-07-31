package com.marsrover;


import java.util.ArrayList;

public class MarsRoverApp {

    MarsRover marsRover;
    Parser parser;
    String commandString;

    public MarsRoverApp(MarsRover marsRover, Parser parser, String commandString) {
        this.marsRover = marsRover;
        this.parser = parser;
        this.commandString = commandString;
    }

    public String startRoverAndPerformOperations() {
        ArrayList<RoverCommand> commandList = parser.convertCommandStringToListOfExecutableCommands(commandString);
        for (int i = 0; i < commandList.size(); i++) {
            commandList.get(i).execute();
        }
        return marsRover.toString();
    }
}
