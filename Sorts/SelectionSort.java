package Sorts;
public class SelectionSort extends Sort{
    public SelectionSort(){
        super("Selection");
    }
    public SelectionSort(int[] array){
        super("Selection",array);
    }
    public void sort(){
        for(int i = 0; i<array.length;i++){
            int min = array[i];
            int ind = i;
            for(int j = i; j<array.length;j++){
                if(array[j]<min){
                    min = array[j];
                    ind = j;
                }
            }
            swap(i,ind);
        }
    }
    public double avgTimeTest(int numOfTests){
        long sumTime = 0;
        for(int i = 0; i<numOfTests;i++){
            long startTime = System.nanoTime();
            this.sort();
            long endTime = System.nanoTime();
            sumTime += (endTime-startTime);
            this.shuffle();
        }
        sumTime = sumTime / numOfTests;
        return sumTime/1000000000.0;//Nanoseconds to Seconds
    }
}

