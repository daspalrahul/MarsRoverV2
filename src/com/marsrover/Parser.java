package com.marsrover;


import java.util.ArrayList;

public class Parser {

    private MarsRover marsRover;

    public Parser(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public ArrayList<RoverCommand> convertCommandStringToListOfExecutableCommands(String commandString) {
        ArrayList<RoverCommand> commandList = new ArrayList<>();
        for (int i = 0; i < commandString.length(); i++) {
            if (commandString.charAt(i) == 'L')
                commandList.add(new TurnLeft(marsRover));
            else if (commandString.charAt(i) == 'R')
                commandList.add(new TurnRight(marsRover));
            else if (commandString.charAt(i) == 'M')
                commandList.add(new Move(marsRover));
        }
        return commandList;
    }
}
