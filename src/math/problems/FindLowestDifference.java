package math.problems;

public class FindLowestDifference {
    /*
        Implement in java.
        Read this below two array. Find the lowest difference between the two array cell.
        The lowest difference between cells is 1
       */
    public static int findLowestDifference(int[]array1, int[] array2, int x, int y) {
        int lDifference = Integer.MAX_VALUE;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int difference = Math.abs(array1[i] - array2[j]);
                if (difference < lDifference) {
                    lDifference = difference;
                }
            }
        }
        return lDifference;
    }
    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int x = array1.length;
        int y = array2.length;

        System.out.println(findLowestDifference(array1, array2, x, y));
    }
}





