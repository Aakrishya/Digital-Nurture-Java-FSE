package WEEK1.DSA.FinancialForcasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double amount,
                                              double growthRate,
                                              int years) {

        // Base condition
        if (years == 0) {
            return amount;
        }

        // Recursive call
        return calculateFutureValue(
                amount + (amount * growthRate),
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double currentAmount = 10000;
        double annualGrowthRate = 0.10; // 10%
        int numberOfYears = 5;

        double futureAmount = calculateFutureValue(
                currentAmount,
                annualGrowthRate,
                numberOfYears
        );

        System.out.println("Current Amount : " + currentAmount);
        System.out.println("Growth Rate : " + (annualGrowthRate * 100) + "%");
        System.out.println("Years : " + numberOfYears);
        System.out.println("Future Amount : " + futureAmount);
    }
}