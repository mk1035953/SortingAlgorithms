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
}
