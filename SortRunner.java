import Sorts.*;
import java.util.ArrayList;
public class SortRunner {
    public static void main(String[] args){
        ArrayList<Sort> sorts = new ArrayList<>();
        //Iterative Sorts
        sorts.add(new ShellSort());
        sorts.add(new InsertionSort());
        // sorts.add(new SelectionSort());
        // sorts.add(new ExchangeSort());
        // sorts.add(new ICantBelieveItCanSort());
        // sorts.add(new BubbleSort());
        // sorts.add(new CocktailShakerSort());
        //Recursive Sorts
        sorts.add(new MergeSort());
        sorts.add(new MergeInsertionSort());
        sorts.add(new QuickSort());
        sorts.add(new HeapSort());
        sorts.add(new IntroSort());

        // System.out.println(sorts.get(0).toString());
        // sorts.get(0).sort();
        // System.out.println(sorts.get(0).toString());

        
        int numOfTests = 100;
        System.out.println("Average(of " + numOfTests + ") Sorting Times for size: " + sorts.get(0).getLen());
        System.out.println("Iterative Sorts:");
        for(int i = 0;i<sorts.size();i++){
            if(sorts.get(i).getType().equals("Merge")){
                System.out.println("Recursive Sorts:");
            }
            System.out.println("    "+sorts.get(i).getType()+": " + sorts.get(i).avgTimeTest(numOfTests) + "s");
        }//*/
    }
}