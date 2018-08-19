
import java.util.LinkedList;

public class Solution {

    public static int[] arraySolution(int[] A, int K) {
        LinkedList<Integer> bufor = new LinkedList<Integer>();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < A.length; j++) {
                if (j == 0) {
                    bufor.add(A[j + 1]);
                    A[j + 1] = A[j];
                } else if (j > 0 && j < A.length - 1) {
                    bufor.add(A[j + 1]);
                    A[j + 1] = bufor.getFirst();
                    bufor.removeFirst();
                } else if (j == A.length - 1) {
                    A[0] = bufor.getFirst();
                    bufor.clear();
                }

            }
        }
        return A;
    }
}
