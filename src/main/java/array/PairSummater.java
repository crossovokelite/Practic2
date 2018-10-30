package array;

import exceptions.ArraySummaterException;
/** Pair summater implementation*/
public class PairSummater implements IArraySummater {
    /**
     * sum function for sum pair in array
     * @param array - int array
     * @throws ArraySummaterException - exception that throw when array has odd length
     * @return int
     */
    public int sum(final int[] array) throws ArraySummaterException {
        int max = -Integer.MIN_VALUE;
        if (array.length % 2 == 0) {
            int i = 0;
            while (i != array.length) {
                if (array[i] + array[i + 1] > max) {
                    max = array[i] + array[i + 1];
                }
                i = i + 2;
            }
        } else {
            throw new ArraySummaterException("odd number elements");
        }
        return max;
    }
}
