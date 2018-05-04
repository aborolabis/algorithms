package pl.aborolabis.algorithms.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest{

    @Test
    public void testBubbleSort() {
        int[] array = {5, 2, 3, 7, 1, 0, 9};

        int[] sortedArray = BubbleSort.bubbleSort(array);

        Assertions.assertEquals(0 ,sortedArray[0]);
        Assertions.assertEquals(1 ,sortedArray[1]);
        Assertions.assertEquals(2 ,sortedArray[2]);
        Assertions.assertEquals(3 ,sortedArray[3]);
        Assertions.assertEquals(5 ,sortedArray[4]);
        Assertions.assertEquals(7 ,sortedArray[5]);
        Assertions.assertEquals(9 ,sortedArray[6]);
    }

    @Test
    public void testBubbleSortWithNegatives(){
        int [] array = {-1, -4, -9, -11, 2, 7, 18};

        int [] sortedArray = BubbleSort.bubbleSort(array);

        Assertions.assertEquals(-11 ,sortedArray[0]);
        Assertions.assertEquals(-9 ,sortedArray[1]);
        Assertions.assertEquals(-4 ,sortedArray[2]);
        Assertions.assertEquals(-1 ,sortedArray[3]);
        Assertions.assertEquals(2 ,sortedArray[4]);
        Assertions.assertEquals(7 ,sortedArray[5]);
        Assertions.assertEquals(18 ,sortedArray[6]);
    }

    @Test
    public void testBubbleSortWithRepeatingNumbers(){
        int [] array = {1, 7, 3, 1, 0, 7, 1};

        int [] sortedArray = BubbleSort.bubbleSort(array);

        Assertions.assertEquals(0 ,sortedArray[0]);
        Assertions.assertEquals(1 ,sortedArray[1]);
        Assertions.assertEquals(1 ,sortedArray[2]);
        Assertions.assertEquals(1 ,sortedArray[3]);
        Assertions.assertEquals(3 ,sortedArray[4]);
        Assertions.assertEquals(7 ,sortedArray[5]);
        Assertions.assertEquals(7 ,sortedArray[6]);
    }

}
