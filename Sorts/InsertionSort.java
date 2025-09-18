package Sorts;
public class InsertionSort extends Sort{
    public InsertionSort(){
        super("Insertion");
    }
    public InsertionSort(int[] array){
        super("Insertion", array);
    }
    public void sort(){
        for(int i = 1; i<array.length-1;i++){
            for(int j = i-1; j>=0;j--){
                if(array[j]>array[i]){
                    swap(j,i);
                }
            }
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
