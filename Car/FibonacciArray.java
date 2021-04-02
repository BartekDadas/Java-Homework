public class FibonacciArray {
    static int[] fibonacciArray(int length) {
        int[] series = new int[length];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < length ; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

}

