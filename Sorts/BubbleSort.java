package Sorts;

public class BubbleSort extends Sort{
    public BubbleSort(){
        super("Bubble");
    }
    public BubbleSort(int[] array){
        super("Bubble", array);
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
}
