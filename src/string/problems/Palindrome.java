package string.problems;
import java.util.Scanner;
public class Palindrome {
    /*
           If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
           Palindrome. So write java code to check if a given String is Palindrome or not.
          */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String given = input.next();
System.out.println(given +" is a palindrome: "+isPalindrome(given));
    }
    public static boolean isPalindrome(String given) {
        if (given == null) {
            return false;

        }
        String reverse = new StringBuilder(given).reverse().toString();
        return given.equals(reverse);

    }
}
