package com.marsrover;


import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String roverPosition = sc.nextLine();
            if (roverPosition.isEmpty())
                break;
            String commands = sc.nextLine();
            String[] initialPosition = roverPosition.split(" ");
            MarsRover marsRover = new MarsRover(Integer.parseInt(initialPosition[0]), Integer.parseInt(initialPosition[1]), initialPosition[2]);
            Parser parser = new Parser(marsRover);
            MarsRoverApp marsRoverApp = new MarsRoverApp(marsRover, parser, commands);
            String finalRoverPosition = marsRoverApp.startRoverAndPerformOperations();
            System.out.println(finalRoverPosition);
        }
    }
}
