package com.aqingsao;

public class Sticks {

    public double maxLength(int[] maxHeight) {
        double totalLengthOnHigh = 0;
        double totalLengthOnLow = 0;

        for (int i = maxHeight.length - 1; i > 0; i--) {
            double lengthHigh2High = Math.sqrt(Math.pow(maxHeight[i - 1] - maxHeight[i], 2) + 1);
            double lengthHigh2Low = Math.sqrt(Math.pow(maxHeight[i - 1] - 1, 2) + 1);

            double lengthLow2High = Math.sqrt(Math.pow(maxHeight[i] - 1, 2) + 1);
            double lengthLow2Low = 1;

            double lengthOnHigh = Math.max(lengthHigh2High + totalLengthOnHigh, lengthHigh2Low + totalLengthOnLow);
            double lengthOnLow = Math.max(lengthLow2High + totalLengthOnHigh, lengthLow2Low + totalLengthOnLow);
            totalLengthOnHigh = lengthOnHigh;
            totalLengthOnLow = lengthOnLow;
        }
        return Math.max(totalLengthOnHigh, totalLengthOnLow);
    }
}
