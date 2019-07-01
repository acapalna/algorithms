package org.fasttrackit;

public class BloodAlcoholCalculator {

//    BAC = (A × 5.14 / W × r) − .015 × H
//            where
//• A is total alcohol consumed, in ounces (oz).
//            • W is body weight in pounds.
//            • r is the alcohol distribution ratio:
//              – 0.73 for men
//              – 0.66 for women
//• H is number of hours since the last drink.
        public void bloodAlcoholCalculator() {

        double legalToDrive = 0.08;
        double weight = 100;
        double alcoholConsumption = 9;
        String gender = "man";
        double hourSinceLast = 1.3;
        double alcoholDistr = 0.73;
        boolean metric = false;

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
    }
}
