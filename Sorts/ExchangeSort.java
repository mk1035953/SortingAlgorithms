package Sorts;
public class ExchangeSort extends Sort{
    public ExchangeSort(){
        super("Exchange");
    }
    public ExchangeSort(int[] array){
        super("Exchange",array);
    }
    public void sort(){
        for(int i = 0; i<array.length;i++){
            for(int j = i; j<array.length;j++){
                if(array[j]<array[i]){
                    swap(i,j);
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

