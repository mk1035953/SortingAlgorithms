package Sorts;
public class InsertionSort extends Sort{
    public InsertionSort(){
        super("Insertion");
    }
    public InsertionSort(int[] array){
        super("Insertion", array);
    }
    public void sort(){  
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}