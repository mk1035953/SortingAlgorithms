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
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swaps++;
                }
            }
        }
    }
}
