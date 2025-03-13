//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] initArr = {1, 12, 9, 4, 15, 6, 27, 8, 39};
        int n = 5;
    }
    private static void findLargestAt(int findRank, int[] arr){
        for (int element: arr) {
            int rank = 1;
            for (int scanAt: arr){
                if (element > scanAt) rank++;
                if (rank > findRank) break;
            }

            //check
            if(rank == findRank){
                System.out.println("Found is: " + element);
                return;
            }
        }
    }
}