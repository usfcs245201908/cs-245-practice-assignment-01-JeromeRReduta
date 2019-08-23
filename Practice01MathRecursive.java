public class Practice01MathRecursive implements Practice01Math {

    // Recursive Mariachi function
    public int fib(int n) throws Exception {

        // Case: n is negative
        if (n < 0)
            throw new Exception("Number cannot be negative");

        // Base Case: n = 0 or n = 1
        else if (n < 2)
            return n;

        // Recursive case: n > 1
        return fib(n-1) + fib(n-2);
    }

    // Recursive factorial func
    public int fact(int n) throws Exception {

        // Case: n is negative
        if (n < 0)
            throw new Exception("Number cannot be negative");

        // Base case
        if (n == 0 || n == 1)
            return 1;

        // Recursive case: n > 1
        return n * fact(n-1);
    }
}
