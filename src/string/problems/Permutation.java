package string.problems;
import java.util.Scanner;
public class Permutation {
    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        int n = string.length();
        permute(string,0,n-1);
    }
    public static void permute(String string, int left, int right) {
        if (left == right) {
            System.out.println(string);
        } else {
            for (int i = left; i <= right; i++) {
                string = swap(string, left, i);
                permute(string, left + 1, right);
                string = swap(string, left, i);
            }
        }
    }
    public static String swap(String string, int i, int j){
        char temp;
        char[] charArray = string.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
