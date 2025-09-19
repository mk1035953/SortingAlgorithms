package Sorts;

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
}
