public class FibonacciArray {
    static void fibFill(int[] fib) {
        fib[0] = 1;
        fib[1] = 1;
         for (int i = 2; i < fib.length; ) {
             while(primeCheck(i)) {
                 fib[i] = fib[i - 1] + fib[i - 2];
                 i++;
             }
         }
    }

    static boolean primeCheck(int i) {
        for (int number = 2; number <= i / 2; ++number) {
            if (i % number == 0) {
                break;
            }
        }
        return false;
    }
}

