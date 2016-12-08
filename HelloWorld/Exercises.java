/** 
 * Complete the following examples as methods of the Exercises class below and call each 
 * respective answer in main.
 */


public class Exercises {

    /**
     * Question #1: Logical operators can simplify nested conditional statements. 
     * For example, can you rewrite this code using a single if statement?
     */
    
    public static void Question1(int x) {
        if( x > 0 ) {
            if( x < 10 ) {
                System.out.println("positive single digit number.");
            }
        }
    }
        
    /**
     * Question #2: Fermat's Last Theorem says that there are no integers a, b, and c such that
     * a^n + b^n = c^n, except when n <= 2. 
     * 
     * Write a method named checkFermat that takes four integers as parameters -- a, b, c and n
     * and checks to see if Fermat's theorem holds.  If n is greater than 2 and a^n + b^n = c^n, 
     * the program should display "Holy smokes, Fermat was wrong!" Otherwise the program should
     * display "No, that doesn't work."
     * 
     * Hint: You may want to use Math.pow.
     * Example: Math.pow(2,3) takes 2 and raises it to the 3rd power eg. 2^3.
     */
    
    //TODO Question2 Method HERE
    
    
    
    /**
     * Question #3: This exercise reviews the flow of execution through a program with multiple methods.
     * Read the following code and answer the questions.
     * 
     * Note: There is a call to zippo in main that is part of this question.
     * 
     * Part 1: Write the number 1 in //comments next to the first line of code in this program that will
     * execute.
     * 
     * Part 2: Write the number 2 in //comments next to the seconds line of code, and so on until the end of
     * the program.  If a line is executed more than once, it might end up with more than one number next to it.
     * 
     * Part 3: What is the value of the parameter blimp when baffle gets invoked?
     * 
     * Part 4: What is the output of this program?
     */
    
    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
        if(flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

    public static void main(String[] args) {
        
        Question1(5);
        
        //The below invokation is part of Question 3
        zippo("rattle", 13);
    }
}