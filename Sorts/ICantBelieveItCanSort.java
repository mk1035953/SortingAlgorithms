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
}
