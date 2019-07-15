package org.fasttrackit;

import java.util.Scanner;

public class KarvonenHeartRate {
    private static Scanner scanner = new Scanner(System.in);

    public void hartRateScanner(){

        System.out.println("Please insert age!");
        double age = scanner.nextDouble();

        System.out.println("Please insert your resting hart rate!");
        double restingHR = scanner.nextDouble();

        double targetHeartRate = 0;

        System.out.println("Intensity   | Rate");
        System.out.println("------------|-----");
        for (double intensity = 60; intensity <= 95; intensity = intensity + 5) {
            targetHeartRate = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;
            //System.out.println("Target hart rate fot intensity: "+ (int)intensity + " is " + (int)targetHeartRate);
            System.out.println( (int)intensity + "%         | " + (int)targetHeartRate + " bpm" );
        }


    }
}
