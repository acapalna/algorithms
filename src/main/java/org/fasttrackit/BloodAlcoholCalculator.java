package org.fasttrackit;

import java.util.Scanner;

public class BloodAlcoholCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public void bloodAlcoholCalculator() {

        boolean metric = getMetricScale();
        double weight = getPositiveNumberFromUser();
        double alcoholConsumption = 9;
        String gender = getGenderFromUser();
        double hourSinceLast = getHoursSinceLastDrink();
        double alcoholDistr = 0.73;
        double legalToDrive = 0.08;

        if (gender.equals("woman")){
            alcoholDistr = 0.66;
        }

        if (metric){
            weight = weight / 2.205;  // pounds to kg
            alcoholConsumption = alcoholConsumption / 33.814; //oz to litre
        }

        double BAC = (alcoholConsumption * 5.14 / weight * alcoholDistr) - (0.015 * hourSinceLast);

        System.out.println("Your BAC is " + BAC);
        if(BAC > legalToDrive)
            System.out.println("It is not legal for you to drive.");
        else
            System.out.println("It is legal for you to drive.");
    }

    private double getWeightFromUser(){

        double nr = 0;
        int counter = 0;
        while(true){
            counter++;
            try{
                System.out.println("Insert weight in pounds or kg: ");
                nr = Double.valueOf(scanner.nextLine());
                break;
            }catch(NumberFormatException e){
                if(counter > 2){
                    System.out.println("It is so hard to insert a number? Try again!");
                }else {
                    System.out.println("This is not a number");
                }
            }
        }
        return nr;
    }

    public double getPositiveNumberFromUser(){
        double nr = 0;
        int counter = 0;
        do{
            counter++;
            nr = getWeightFromUser();
            if (nr < 0) {
                if(counter > 2){
                    System.out.println("It is so hard to insert a positive number? try again");
                }else {
                    System.out.println("This is not a number. Try again");
                }
            }
        }while(nr < 0);
        return nr;
    }

    public String getGenderFromUser(){
        System.out.println("Please insert gender:");
        String gender = scanner.nextLine();
        return gender;
    }

    public double getAlcoholAmountPerDrink(){
        System.out.println("Please insert gender:");
        double alcoholPerAmount = scanner.nextDouble();
        return alcoholPerAmount;
    }

    public double getHoursSinceLastDrink(){
        System.out.println("Please insert gender:");
        double hours = scanner.nextDouble();
        return hours;
    }

    public boolean getMetricScale(){
        System.out.println("Did you use metric values?");
        String result = scanner.nextLine();
        if (result.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

}
