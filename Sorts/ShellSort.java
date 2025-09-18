/*
* This is Shell Sort, a Sorting algorithm that helps to mitigate downside of Insertion Sort
* It is a gapped Insertion Sort, where it inserts the numbers across the array but only along the lines of gap
* It is a relatively fast Sort that is memory efficient and decently time efficient with good overall times
* the downside is it is not a true divide and conquer sort, unlike Merge Sort or Quick Sort
* So on average it will be a bit quicker
*/
import java.util.ArrayList;
public class ShellSort extends Sort{
    private ArrayList<Integer> gapsize = new ArrayList();
    public ShellSort(){
        super("Shell");
        makeGaps();
    }
    public ShellSort(int[] array){
        super("Shell",array);
        makeGaps();
    }
    public void makeGaps(){
        int num = 1;
        while(num<array.length){
            if(num==1||isPrime(num)){
                gapsize.add(num);
                num*=3;
            }
            else{
                num++;
            }
        }
    }
    public static boolean isPrime(int num){
        for(int i = 2; i<num/2+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public void sort(){
        int gap = gapsize.size()-1;
        while(gap>=0){
            for(int i = 0; i<this.array.length-1||i+gapsize.get(gap)>array.length-1;i+=gapsize.get(gap)){
                if(i+gapsize.get(gap)>array.length-1){
                    break;
                }
                int j = i;
                while(j>=0&&this.array[j]>this.array[j+gapsize.get(gap)]){
                    swap(j,j+gapsize.get(gap));
                    j-=gapsize.get(gap);
                }
            }
            gap--;
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
