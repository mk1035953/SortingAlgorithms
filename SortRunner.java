import Sorts.*;
import java.util.ArrayList;
public class SortRunner {
    public static void main(String[] args){
        ArrayList<Sort> sorts = new ArrayList<>();
        ArrayList<Double> times = new ArrayList<>();
        //Iterative Sorts
        sorts.add(new ShellSort());
        sorts.add(new InsertionSort());
        sorts.add(new SelectionSort());
        sorts.add(new ExchangeSort());
        sorts.add(new ICantBelieveItCanSort());
        sorts.add(new BubbleSort());
        sorts.add(new CocktailShakerSort());
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
        for(int i = 0;i<sorts.size();i++){
            times.add(sorts.get(i).avgTimeTest(numOfTests));
        }//*/
        dualSort(times, sorts);
        for(int i = 0; i<times.size();i++){
            System.out.println((i+1)+". "+sorts.get(i).getType()+": " + times.get(i) + "s");
        }
    }
    public static void dualSort(ArrayList<Double> arr1, ArrayList arr2){
        for (int i = 1; i < arr1.size(); i++) {
            double temp = arr1.get(i);
            Object temp2 = arr2.get(i);
            int j = i - 1;

            while (j >= 0 && arr1.get(j) > temp) {
                arr1.set(j+1, arr1.get(j));
                arr2.set(j+1, arr2.get(j));
                j--;
            }
            arr1.set(j+1, temp);
            arr2.set(j+1, temp2);
        }
    }
}