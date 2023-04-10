package math.problems;

public class MakePyramid {
    /*   Implement a large Pyramid of stars in the screen with java.

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i<= rows; i++){
        for (int j=1;j<rows;j++) {
        System.out.print(" ");
    }
        for (int k =1; k<=2*i-1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

        }
