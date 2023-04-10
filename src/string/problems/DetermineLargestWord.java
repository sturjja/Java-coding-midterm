package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String wordsGiven="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(wordsGiven);
int maxLength = wordNLength.keySet().iterator().next();
String st = wordNLength.get(maxLength);
System.out.println("Longest word length is: " +maxLength);
System.out.println("The longest word is: " +st);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words = wordGiven.split(" ");
        int maxLength = 0;
        String st = "";
        for (String word : words){
            int length= word.length();
            if (length > maxLength){
                maxLength = length;
                st = word;
            }
        }
        map.put(maxLength,st);

        return map;
    }
}
