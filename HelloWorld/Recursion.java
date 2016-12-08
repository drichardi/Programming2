public class Recursion {
    
    public static void nLines(int n){
        if( n > 0) {
            System.out.println();
            nLines(n-1);
        }
    }
    
    public static void CountDown(int n) {
        if( n == 0 ) { //Base Case
            System.out.println("Blastoff!");
        }
        else if( n > 0 ) {
            System.out.println(n);
            CountDown( n-1 ); //recursive call
        }
    }
    
    public static void Forever(String s) {
        System.out.println(s);
        Forever(s);
    }
    
    public static void CountUp(int n) {
        if ( n == 0 ) {
            System.out.println("Blastoff!");
        }
        else {
            CountUp(n-1);
            System.out.println(n);
        }
    }
    
    public static void displayBinary(int value) {
        if(value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2); //base 2
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello there!");
        nLines(1);
        System.out.println("Hello there!");
        nLines(3);
        System.out.println("Hello there!");
        
        CountDown(2);
        CountDown(4);
        CountUp(5);
        
        displayBinary(23);
        
     //   Forever("Hi!");
    }
}