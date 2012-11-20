package com.my;

public class Sticks {

    public double maxLength(int[] height) {
        double totalLengthOnHigh = 0;
        double totalLengthOnLow = 0;
        for (int i = height.length - 1; i > 0; i--) {
            double lengthHigh2High = Math.sqrt(Math.pow(height[i - 1] - height[i], 2) + 1);
            double lengthHigh2Low = Math.sqrt(Math.pow(height[i - 1], 2) + 1);

            double lengthLow2High = Math.sqrt(Math.pow(height[i], 2) + 1);
            double lengthLow2Low = 1;

            double lengthOnHigh = Math.max(lengthHigh2High + totalLengthOnHigh, lengthHigh2Low + totalLengthOnLow);
            double lengthOnLow = Math.max(lengthLow2High + totalLengthOnHigh, lengthLow2Low + totalLengthOnLow);
            totalLengthOnHigh = lengthOnHigh;
            totalLengthOnLow = lengthOnLow;
        }
        return Math.max(totalLengthOnHigh, totalLengthOnLow);
    }
}
