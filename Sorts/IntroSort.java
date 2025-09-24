package Sorts;

public class IntroSort extends Sort{
    public IntroSort(){
        super("Intro");
    }
    public IntroSort(int[] array){
        super("Intro", array);
    }
    public void sort(){
        int maxdepth = (int)((Math.log(array.length)/Math.log(2))* 2);
        introsort(0, array.length-1, maxdepth);
    }
    public void introsort(int start, int end, int maxdepth){
        int n = end-start;
        if(n < 16){
            insertionsort(start, end);
        }
        else if(maxdepth == 0){
            heapsort(start,end);
        }
        else{
            int p = partition(array, start, end);
            introsort(start, p, maxdepth - 1);
            introsort(p+1, end, maxdepth - 1);
        }
    }
    public void insertionsort(int start, int end){  
        for (int i = start; i <= end; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= start && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public void heapsort(int start, int end){
        heapify(start, end);

        while(end>start){
            end--;
            swap(end,0);
            siftdown(0, end);
        }
    }
    public void heapify(int start, int end){
        int num =  ((end-2)/2)+1;

        while(num >start){
            num = num -1;
            siftdown(num, end);
        }
    }
    public void siftdown(int root, int end){
        while((2*root+1)<end){
            int child = (2*root+1);
            if(child+1 < end&&array[child]<array[child+1]){
                child++;
            }
            if(array[root]<array[child]){
                swap(root, child);
                root = child;
            }
            else{
                return;
            }
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
