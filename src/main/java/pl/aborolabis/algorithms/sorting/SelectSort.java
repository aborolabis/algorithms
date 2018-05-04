package pl.aborolabis.algorithms.sorting;

public class SelectSort {

    private static int [] array;

    public static int [] sort(int [] givenArray){
        if(givenArray != null) {
            array = givenArray;
            int leastElement = Integer.MAX_VALUE;
            int leastElementIndex = -1;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[j] < leastElement) {
                        leastElement = array[j];
                        leastElementIndex = j;
                    }
                }
                SelectSort.swap(i, leastElementIndex);
                leastElement = Integer.MAX_VALUE;
            }
        }
        return array;
    }

    private static int [] swap(int index1, int index2){
        int element = array[index1];
        array[index1] = array[index2];
        array[index2] = element;

        return array;
    }
}
