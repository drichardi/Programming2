public class FooCorporation {
    
    final static double MINIMUM_WAGE = 8.0;
    final static double REGULAR_PAY_HOURS = 40.0;
    final static double MAX_TOTAL_HOURS = 60.0;
    final static double OVERTIME_RATE_ADJUST = 1.5;
    
    public static void Pay(double basePay, double hoursWorked) {
        if( basePay < MINIMUM_WAGE ) {
            System.out.printf( "Error. Base pay must be equal to or above $%.2f\n", MINIMUM_WAGE);
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
        Pay(7.50, 35);
        Pay(9.00, 38);
        Pay(8.20, 52);
        Pay(10.00, 73);
        
    }
}