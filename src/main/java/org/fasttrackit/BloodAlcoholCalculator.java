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

        double weight = 55;
        double alcoholConsumption = 3;
        String gender = "man";
        double hourSinceLast = 1.3;

        double alcoholDistr = 1;
        if (gender.equals("man")){
            alcoholDistr = 0.73;
        }
        if (gender.equals("woman")){
            alcoholDistr = 0.66;
        }

        double BAC = (alcoholConsumption * 5.14 / weight * alcoholDistr) - 0.15 * hourSinceLast;

        System.out.println(BAC);

    }
}
