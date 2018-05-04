package pl.aborolabis.algorithms.sorting;

public class InsertSort {

    private static int [] array;

    public static int [] sort(int [] givenArray){
        if(givenArray != null){
            array = givenArray;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    array = InsertSort.swap(i, i + 1);
                    for(int j=i; j > 0; j--){
                        if(array[j-1] > array[j]){
                            array = InsertSort.swap(j-1, j);
                        }
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
