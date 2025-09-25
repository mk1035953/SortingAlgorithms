package Sorts;

public class CocktailShakerSort extends Sort{
    public CocktailShakerSort(){
        super("Cocktail Shaker");
    }
    public CocktailShakerSort(int[] array){
        super("Cocktail Shaker", array);
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
            swaps = 0;
            for(int i = this.array.length-1; i>0;i--){
                if(this.array[i]<this.array[i-1]){
                    swap(i,i-1);
                    swaps++;
                }
            }
        }
    }
}
