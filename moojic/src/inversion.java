import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class inversion {
    public static void main(String args[]) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = 100000;
        int[] A = new int[n];
        String str = s.nextLine();
        int i = 0;
        while (str != null) {
            A[i] = Integer.parseInt(str);
            i++;
            str = s.nextLine();
        }

        Pair a = sortAndCount(A);
        System.out.println(a.x);
    }

    private static Pair sortAndCount(int[] a) {
        if (a.length == 1) {
            return new Pair(a, 0);
        } else {
            int[] leftArray = new int[a.length / 2];
            System.arraycopy(a, 0, leftArray, 0, leftArray.length);
            int[] rightArray = new int[a.length - leftArray.length];
            System.arraycopy(a, leftArray.length, rightArray, 0,
                    rightArray.length);
            Pair x = sortAndCount(leftArray);

            Pair y = sortAndCount(rightArray);
            Pair z = MergeAndCountSplitInv(x.Array, y.Array, a.length);

            return new Pair(z.Array, x.x + y.x + z.x);
        }

    }

    private static Pair MergeAndCountSplitInv(int[] B, int[] C, int n) {
        long total = 0;
        int[] D = new int[n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < n; k++) {
            if (j == C.length || i != B.length && B[i] < C[j]) {
                D[k] = B[i];
                i++;
            } else if (i == B.length || j != C.length && C[j] < B[i]) {
                D[k] = C[j];
                j++;
                total += B.length - i;
            }
        }
        return new Pair(D, total);
    }
}

class Pair {
    Pair(int[] A, long l) {
        this.Array = A;
        this.x = l;
    }

    public int[] Array;
    public long x;
}