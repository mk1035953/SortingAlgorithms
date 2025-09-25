package Sorts;

public class HeapSort extends Sort{
    public HeapSort(){
        super("Heap");
    }
    public HeapSort(int[] array){
        super("Heap", array);
    }
    public void sort(){
        heapify();

        int end = array.length;
        while(end>1){
            end--;
            swap(end,0);
            siftdown(0, end);
        }
    }
    public void heapify(){
        int start =  ((array.length-2)/2)+1;

        while(start >0){
            start = start -1;
            siftdown(start, array.length);
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
}