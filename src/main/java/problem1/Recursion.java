package problem1;

public class Recursion {

    public static int method(int[] array) {
        return helper(array, 0, array[0], 0);
    }

    private static int helper(int[] array, int p, int q, int r) {
        if (p == array.length)
            return r;

        int e = helper(array, p + 1, q, r);
        int f = r;
        if (array[p] > q || p == 0) {
            f = helper(array, p + 1, array[p], r + array[p]);
        }
        return Integer.max(e, f);
    }
}
