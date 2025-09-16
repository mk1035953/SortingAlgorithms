public class SortRunner {
    public static void main(String[] args){
        ShellSort shell = new ShellSort();
        System.out.println(shell.toString());
        shell.sort();
        System.out.println(shell.toString());
    }
}
