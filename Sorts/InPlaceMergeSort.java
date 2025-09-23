package Sorts;
import java.util.Arrays;

public class InPlaceMergeSort extends Sort{
    public InPlaceMergeSort(){
        super("Merge");
    }
    public InPlaceMergeSort(int[] array){
        super("Merge",array);
    }
    public void sort(){
        array = MergeSort(array, 0, array.length);
    }
    public int[] MergeSort(int[] arr, int start, int end){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        MergeSort(Arrays.copyOfRange(arr, 0, mid));
        MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        MergeHelp(arr1,arr2);
    }
    public int[] MergeHelp(int[] arr1, int[] arr2){
        int a = 0;
        int b = 0;
        int[] arr = new int[arr1.length+arr2.length];
        while(a<arr1.length&&b<arr2.length){
            if(arr1[a]>arr2[b]){
                arr[a+b] = arr2[b];
                b++;
            }
            else{
                arr[a+b] = arr1[a];
                a++;
            }
        }
        if(a==arr1.length&&b!=arr2.length){
            for(int i = b; i<arr2.length;i++){
                arr[a+i] = arr2[i];
            }
        }
        if(b==arr2.length&&a!=arr1.length){
            for(int i = a; i<arr1.length;i++){
                arr[b+i] = arr1[i];
            }
        }

        return arr;
    }
}
