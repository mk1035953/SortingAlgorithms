package Sorts;
import java.util.Arrays;

public class MergeInsertionSort extends Sort{
    public MergeInsertionSort(){
        super("MergeInsertion");
    }
    public MergeInsertionSort(int[] array){
        super("MergeInsertion",array);
    }
    public void sort(){
        array = MergeSort(array);
    }
    public int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] arr1 = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return(MergeHelp(arr1,arr2));
    }
    public int[] MergeHelp(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        
        for(int i = 0; i< arr1.length;i++){
            arr[i] = arr1[i];
        }
        for(int i = 0; i<arr2.length;i++){
            arr[i+arr1.length] = arr2[i];
        }
        
        InsertionSort(arr, arr1.length);

        return arr;
    }
    public void InsertionSort(int[] arr, int ind){
        for (int i = ind; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}