/*
* This is the runner class to test all the Sorting algorithms that are available
*/
public class SortRunner {
    public static void main(String[] args){
        ShellSort shell = new ShellSort();
        System.out.println(shell.toString());
        shell.sort();
        System.out.println(shell.toString());
    }
}

