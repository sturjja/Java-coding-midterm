package string.problems;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
    //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String string1= scan.next();
      String string2= scan.next();

      boolean areAnagrams = checkAnagram(string1,string2);

      if (areAnagrams){
          System.out.println(string1 + " and " + string2 + " are anagrams");
      } else {
          System.out.println(string1 + " and " + string2 + " are not anagrams");
      }
    }
    public static boolean checkAnagram(String string1, String str2) {
        if (string1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = string1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

