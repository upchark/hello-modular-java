package com.uk.features;

public interface PrivateMethodInterface {
    default String className() {
        return this.getClass().getName();
    }

    static Integer creditScore(String pan) {
        return calculateCredit(pan);
    }

    private static void creditScore2(){}

    private static Integer calculateCredit(String pan) {
        final int pendingLoans = 0;
        final String creditCardUsage = "LOW";
        final boolean isDefaulter = false;
        int divider = 0;
        final Double income = 3000000d;
        if (isDefaulter) {
            return 0;
        }
        if ("LOW".equals(creditCardUsage)) {
            divider = 10;
        } else if ("MEDIUM".equals(creditCardUsage)) {
            divider = 50;
        } else {
            divider = 80;
        }
        Long score = Math.round(income / (pendingLoans * divider));
        return score.intValue();
    }
}
