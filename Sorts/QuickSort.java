package Sorts;

public class QuickSort extends Sort{
    public QuickSort(){
        super("Quick");
    }
    public QuickSort(int[] array){
        super("Quick", array);
    }
    public void sort(){  
        quicksort(0, array.length-1);
    }
    public void quicksort(int lo, int hi){
        if (lo >= 0 && hi >= 0 && lo < hi){
            int p = partition(array, lo, hi);
            quicksort(lo, p);
            quicksort(p + 1, hi);
        }
    }
    public int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];

        int a = lo - 1;
        int b = hi + 1;
        if(a<0){
            a=0;
        }
        if(b>hi){
            b = hi;
        }

        while(true){
            while(arr[a] < pivot){
                a++;
            }
            
            while(arr[b] > pivot){
                b--;
            }

            if(a >= b){
                return b;
            }
            
            swap(arr,a,b);
        }
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
