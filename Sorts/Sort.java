import java.util.ArrayList;
import java.util.Collections;
public class Sort{
    protected int[] array;
    protected String type;
    private boolean isNew;

    //Constructors
    public Sort(){
        this.array = new int[100];
        this.type = "N/A";
        isNew = true;
        shuffle();
    }
    public Sort(int[] array){
        this.array = array;
        this.type = "N/A";
    }
    public Sort(String type){
        this.array = new int[100];
        this.type = type;
        isNew = true;
        shuffle();
    }
    public Sort(String type, int[] array){
        this.array = array;
        this.type = type;
    }

    public String toString(){
        String str = "[";

        for(int i = 0; i< this.array.length-1; i++){
            str += this.array[i] + ", ";
        }
        str += this.array[this.array.length-1] + "]";

        return str;
    }
    public void shuffle(){
        for(int i = 0; i<this.array.length;i++){
            array[i] = i;
        }
        isNew = false;
        ArrayList<Integer> temp = new ArrayList();
        for(int x:array){
            temp.add(x);
        }
        Collections.shuffle(temp);
        for(int i = 0; i<array.length;i++){
            array[i] = temp.get(i);
        }
    }
    public void sort(){}//this is a placeholder for the subclasses
    public String getType(){return type;}
}