package com.codewarstraining.codewarstraining.decodeItWyzwanie;

import java.util.Scanner;

public class Quest1 {

    public String checkIfTomCanCarryOn() {
        Scanner input = new Scanner(System.in);
        int testQty =  input.nextInt();
        String result = "";

        for(int i=0; i<testQty; i++){
            input.nextLine();
            int m2 = input.nextInt();
            int capacityInKg = input.nextInt();
            int weightOfPackage = input.nextInt();
            double needToCarryDividedByCapacity = (double) weightOfPackage*m2/capacityInKg;

            if (needToCarryDividedByCapacity<=1.0) {
                result = result + "yes" + "\n";
            } else if (needToCarryDividedByCapacity>1.0) {
                result = result + "no" + "\n";
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append(result);
        builder.deleteCharAt(result.length()-1);
        result = builder.toString();

        return result;
    }
}
