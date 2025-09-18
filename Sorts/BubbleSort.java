/*
* The standard BubbleSort Algorithm, it is intended to be a very simple and natural algorithm swapping pairs that are not in the right spot.
* However it is typically not very fast, only used as a last resort, or need a quick sort for a small amount of elements
*/
public class BubbleSort extends Sort{

    //Constructors
    public BubbleSort(){
        super("BubbleSort");
    }
    public BubbleSort(int[] array){
        super("Bubble Sort", array);
    }

    public String toString(){
        return super.toString();
    }

    public void sort(){
        int swaps = 1;
        while(swaps!=0){
            swaps = 0;
            for(int i = 0; i<this.array.length-1;i++){
                if(this.array[i]>this.array[i+1]){
                    swap(i,i+1);
                    swaps++;
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
