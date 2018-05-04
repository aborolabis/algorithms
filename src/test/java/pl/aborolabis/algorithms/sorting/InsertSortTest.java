package pl.aborolabis.algorithms.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertSortTest {

    @Test
    public void testInsertSort(){
        int [] array = {3, 2, 8, 1};

        int[] result = InsertSort.sort(array);

        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(2, result[1]);
        Assertions.assertEquals(3, result[2]);
        Assertions.assertEquals(8, result[3]);
    }

    @Test
    public void testInsertSortWithMoreNumbers() {
        int[] array = {5, 2, 3, 7, 1, 0, 9};

        int[] sortedArray = InsertSort.sort(array);

        Assertions.assertEquals(0 ,sortedArray[0]);
        Assertions.assertEquals(1 ,sortedArray[1]);
        Assertions.assertEquals(2 ,sortedArray[2]);
        Assertions.assertEquals(3 ,sortedArray[3]);
        Assertions.assertEquals(5 ,sortedArray[4]);
        Assertions.assertEquals(7 ,sortedArray[5]);
        Assertions.assertEquals(9 ,sortedArray[6]);
    }

    @Test
    public void testInsertSortWithNegatives(){
        int [] array = {-1, -4, -9, -11, 2, 7, 18};

        int [] sortedArray = InsertSort.sort(array);

        Assertions.assertEquals(-11 ,sortedArray[0]);
        Assertions.assertEquals(-9 ,sortedArray[1]);
        Assertions.assertEquals(-4 ,sortedArray[2]);
        Assertions.assertEquals(-1 ,sortedArray[3]);
        Assertions.assertEquals(2 ,sortedArray[4]);
        Assertions.assertEquals(7 ,sortedArray[5]);
        Assertions.assertEquals(18 ,sortedArray[6]);
    }

    @Test
    public void testInsertSortWithRepeatingNumbers(){
        int [] array = {1, 7, 3, 1, 0, 7, 1};

        int [] sortedArray = InsertSort.sort(array);

        Assertions.assertEquals(0 ,sortedArray[0]);
        Assertions.assertEquals(1 ,sortedArray[1]);
        Assertions.assertEquals(1 ,sortedArray[2]);
        Assertions.assertEquals(1 ,sortedArray[3]);
        Assertions.assertEquals(3 ,sortedArray[4]);
        Assertions.assertEquals(7 ,sortedArray[5]);
        Assertions.assertEquals(7 ,sortedArray[6]);
    }

    @Test
    public void testInsertSortWithEmptyArray(){
        int [] array = null;

        int [] result = InsertSort.sort(array);

        Assertions.assertNull(result);
    }
}