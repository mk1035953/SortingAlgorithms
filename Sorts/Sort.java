package Sorts;
import java.util.ArrayList;
import java.util.Collections;
public class Sort{
    protected int[] array;
    protected String type;
    final private int defLen = 1000000;

    //Constructors
    public Sort(){
        this.array = new int[defLen];
        this.type = "N/A";
        for(int i = 0; i<defLen;i++){
            array[i] = i;
        }
        shuffle();
    }
    public Sort(int[] array){
        this.array = array;
        this.type = "N/A";
    }
    public Sort(String type){
        this.array = new int[defLen];
        this.type = type;
        for(int i = 0; i<defLen;i++){
            array[i] = i;
        }
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
        ArrayList<Integer> temp = new ArrayList(array.length);
        for(int i = 0; i<array.length;i++){
            temp.add(array[i]);
        }
        Collections.shuffle(temp);
        for(int i = 0; i<array.length;i++){
            array[i] = temp.get(i);
        }
    }
    public double avgTimeTest(int numOfTests){
        double sumTime = 0;
        for(int i = 0; i<numOfTests;i++){
            long startTime = System.nanoTime();
            this.sort();
            long endTime = System.nanoTime();
            if(sumTime!=0){
                sumTime = (endTime-startTime);
            }
            else{
                sumTime += sumTime+(endTime-startTime)/2.0;
            }
            this.shuffle();
        }
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
