
public class Main {
    public static void main(String[] args) {

        int[] table = {3, 8, 9, 7, 6};

        int[] tab2 = Solution.arraySolution(table, 3);

        for (int i = 0; i < tab2.length; i++) {
            System.out.print("[" + tab2[i] + "] ");
        }

    }
}
