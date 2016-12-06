/**
 * FooCorporation class for computing weekly pay for employees.
 */

public class FooCorporation {
    
    /** Default $8.00 per hour */
    final static double MINIMUM_WAGE = 8.0; 
    /** Total of 40 hours at base pay rate before overtime rate */
    final static double REGULAR_PAY_HOURS = 40.0;
    /**FooCorporation does not allow for working more than 60 hours */
    final static double MAX_TOTAL_HOURS = 60.0; 
    /** Overtime pay is adjusted 1.5 x base rate */
    final static double OVERTIME_RATE_ADJUST = 1.5; 
    
    /**
     * Calculate Employee Pay:
     * basePay must be equal to or greater than current MINIMUM_WAGE
     * Overtime wage calculated per hour over 40 hours at adjusted rate
     */
    public static void Pay(double basePay, double hoursWorked) {
        if( basePay < MINIMUM_WAGE ) {
            System.out.printf( "Error. Base pay must be equal to or above $%.2f.\n", MINIMUM_WAGE);
        } 
        else if( hoursWorked <= REGULAR_PAY_HOURS) {
            System.out.printf( "Total pay: $%.2f.\n", hoursWorked * basePay);
        } 
        else if( hoursWorked > MAX_TOTAL_HOURS ) {
            System.out.printf( "Error. You are restricted from working more than %.1f hours in a week.\n",
                              MAX_TOTAL_HOURS);
        } else {
            System.out.printf( "Total pay: $%.2f.\n", 
                hoursWorked % REGULAR_PAY_HOURS * basePay * OVERTIME_RATE_ADJUST
                + REGULAR_PAY_HOURS * basePay );
        }
    }
    public static void main(String[] args) {
        /**
         * Test Cases:
         */
        Pay(7.50, 35);
        Pay(9.00, 38.5);
        Pay(8.20, 47);
        Pay(10.00, 73);
        
        
    }
}
