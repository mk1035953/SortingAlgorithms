package Sorts;
public class ICantBelieveItCanSort extends Sort{
    public ICantBelieveItCanSort(){
        super("ICantBelieveItCanSort");
    }
    public ICantBelieveItCanSort(int[] array){
        super("ICantBelieveItCanSort",array);
    }
    public void sort(){
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array.length;j++){
                if(array[j]>array[i]){
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

