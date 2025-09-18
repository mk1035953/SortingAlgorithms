import java.util.ArrayList;
import java.util.Collections;
public class Sort{
    protected int[] array;
    protected String type;

    //Constructors
    public Sort(){
        this.array = new int[100];
        this.type = "N/A";
        shuffle();
    }
    public Sort(int[] array){
        this.array = array;
        this.type = "N/A";
    }
    public Sort(String type){
        this.array = new int[100];
        this.type = type;
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
        ArrayList<Integer> temp = new ArrayList();
        for(int x:array){
            temp.add(x);
        }
        Collections.shuffle(temp);
        for(int i = 0; i<array.length;i++){
            array[i] = temp.get(i);
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
    public void swap(int a, int b){
        if(a<0||b<0||a>array.length||b>array.length){
            return;
        }
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public void sort(){}//this is a placeholder for the subclasses
    public String getType(){return type;}
}
