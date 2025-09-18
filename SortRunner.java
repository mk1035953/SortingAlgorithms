import Sorts.*;
public class SortRunner {
    public static void main(String[] args){
        ShellSort sort = new ShellSort();
        InsertionSort sort1 = new InsertionSort();
        SelectionSort sort2 = new SelectionSort();
        ExchangeSort sort3 = new ExchangeSort();
        BubbleSort sort4 = new BubbleSort();
        ICantBelieveItCanSort sort5 = new ICantBelieveItCanSort();

        System.out.println(sort5.toString());
        sort5.sort();
        System.out.println(sort5.toString());

        /*
        int numOfTests = 100;
        System.out.println("Average Sorting Times");
        System.out.println("Shell: " + sort.avgTimeTest(numOfTests) + "s");
        System.out.println("Insertion: " + sort1.avgTimeTest(numOfTests) + "s");
        System.out.println("Selection: " + sort2.avgTimeTest(numOfTests) + "s");
        System.out.println("Exchange: " + sort3.avgTimeTest(numOfTests)+ "s");
        System.out.println("Bubble: " + sort4.avgTimeTest(numOfTests)+ "s");
        System.out.println("ICantBelieveItCanSort: " + sort5.avgTimeTest(numOfTests)+ "s");
        */
    }
}

