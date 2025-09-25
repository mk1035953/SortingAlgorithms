package Sorts;

import java.util.ArrayList;
import java.util.Arrays;
public class ShellSort extends Sort{
    private int[] gaps;
    public ShellSort(){
        super("Shell");
        makeGaps();
    }
    public ShellSort(int[] array){
        super("Shell",array);
        makeGaps();
    }
    public void makeGaps(){
        ArrayList<Integer> gapsize = new ArrayList(Arrays.asList(1,4,10,23,57,132,301,701,1750));
        int num = 1750;
        while((int)(num*2.25)<array.length){
            num = (int)(num*2.25);
            gapsize.add(num);
        }
        gaps = new int[gapsize.size()];
        for(int i = 0; i<gaps.length;i++){
            gaps[i]=gapsize.get(i);
        }
    }
    public void sort(){
        for (int g = gaps.length - 1; g >= 0; g--) {
            int gap = gaps[g];
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
        }
    }
}
