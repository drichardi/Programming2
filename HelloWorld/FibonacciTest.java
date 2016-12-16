import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
    
    public void testFibonacci() {
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
    }
}