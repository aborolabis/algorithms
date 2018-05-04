package pl.aborolabis.algorithms.sorting;

public class BubbleSort {

    private static int [] array;

    public static int [] sort (int [] givenArray){
        if(givenArray != null) {
            array = givenArray;
            for (int i = givenArray.length - 1; i > 0; i--) {
                for (int j = givenArray.length - 1; j > 0; j--) {
                    if (givenArray[j] < givenArray[j - 1]) {
                        int[] newArray = BubbleSort.swap(j, j - 1);
                        array = newArray;
                    }
                }
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
