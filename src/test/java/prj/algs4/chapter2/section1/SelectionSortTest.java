package prj.algs4.chapter2.section1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void selectionSort_randomArray_sort() {
        Integer[] src = { 10, -2, 8, 29, 0, -1 };

        Integer[] expected = { -2, -1, 0, 8, 10, 29 };
        SelectionSort.sort(src);

        Assertions.assertArrayEquals(expected, src);
    }

    @Test
    public void selectionSort_sortOneElement_sort() {
        Integer[] src = { 1 };

        Integer[] expected = { 1 };
        SelectionSort.sort(src);

        Assertions.assertArrayEquals(expected, src);
    }

    @Test
    public void selectionSort_duplicateKeys_sort() {
        Integer[] src = { 1, 1, 1 };

        Integer[] expected = { 1, 1, 1 };
        SelectionSort.sort(src);

        Assertions.assertArrayEquals(expected, src);
    }

    @Test
    public void selectionSort_emptyArray_sort() {
        Integer[] src = {};

        Integer[] expected = {};
        SelectionSort.sort(src);

        Assertions.assertArrayEquals(expected, src);
    }
}
