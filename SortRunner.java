import Sorts.*;
import java.util.ArrayList;
public class SortRunner {
    public static void main(String[] args){
        ArrayList<Sort> sorts = new ArrayList<>();
        sorts.add(new ShellSort());
        sorts.add(new InsertionSort());
        sorts.add(new SelectionSort());
        sorts.add(new ExchangeSort());
        sorts.add(new BubbleSort());
        sorts.add(new ICantBelieveItCanSort());
        sorts.add(new MergeSort());
        sorts.add(new MergeInsertionSort());
        sorts.add(new QuickSort());

        //System.out.println(sorts.get(0).toString());
        //sorts.get(0).sort();
        //System.out.println(sorts.get(0).toString());

        
        int numOfTests = 50;
        System.out.println("Average Sorting Times");
        for(int i = 0;i<sorts.size();i++){
            System.out.println(sorts.get(i).getType()+": " + sorts.get(i).avgTimeTest(numOfTests) + "s");
        }
    }
}