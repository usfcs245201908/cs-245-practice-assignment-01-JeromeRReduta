public class Practice01MathIterative implements Practice01Math {

    // Iterative Fibbonachi func
    public int fib(int n) throws Exception {

        // Case: n is negative
        if (n < 0)
            throw new Exception("Number cannot be negative");

        // Case: n == 0 or n == 1
        else if (n < 2)
            return n;

        // Case: n > 1
        // Creates int[] and sets 1st 2 values to 0 and 1...
        // ...respectively
        int[] seq = new int[n+1];
        seq[0] = 0;
        seq[1] = 1;

        // Makes each value in the array the sum of the two...
        // ... #s before it, starting w/ index 2
        for (int i = 2; i <= n; i++)
            seq[i] = seq[i-1] + seq[i-2];

        return seq[n];
    }

    // Iterative factorial func
    public int fact(int n) throws Exception {

        // Case: n is negative
        if (n < 0)
            throw new Exception("Number cannot be negative");

        // Case: n == 0 or n == 1
        else if (n < 2)
            return 1;

        // Case: n > 1
        // Multiplies # by each number until n, including n
        int total = 1;

        for (int i = 2; i <= n; i++)
            total *= i;

        return total;
    }
}
