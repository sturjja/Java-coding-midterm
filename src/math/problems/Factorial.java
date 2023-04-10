package math.problems;
import java.util.Scanner;

public class Factorial {
    static int number;
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Factorial of " + number + " using recursion: " + factorialRecursion(number));
        System.out.println("Factorial of " + number + " using iteration: " + factorialIteration(number));
    }

    public static int factorialRecursion(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorialRecursion(number - 1);
        }
    }

    public static int factorialIteration(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}


