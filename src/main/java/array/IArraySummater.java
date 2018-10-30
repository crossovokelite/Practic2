package array;

import exceptions.ArraySummaterException;
/**
 * Interface IArraySummater for summater's implementations
 */
public interface IArraySummater {
    /**
     * sum function
     * @param array - int array
     * @throws ArraySummaterException - exception
     * @return int
     */
    int sum(int[] array) throws ArraySummaterException;
}
