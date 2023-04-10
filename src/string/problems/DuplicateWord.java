package string.problems;
import java.util.*;
public class DuplicateWord {
    /*
     * Write a java program to find the duplicate words and their number of occurrences in the string.
     * Also Find the average length of the words.
     */
    public static void main(String[] args) {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
String[] words = st.split(" ");

Map<String, Integer> wordCount = new HashMap<>();

for(String word : words){
    if (wordCount.containsKey(word)){
        wordCount.put(word,wordCount.get(word)+1);
    } else {
        wordCount.put(word,1);

    }
}
for (Map.Entry<String, Integer> entry: wordCount.entrySet()){
    if (entry.getValue() > 1){
        System.out.println(entry.getKey()+":" + entry.getValue());
    }
}
// average length
        double totalLength=0;
for (String word :words){
    totalLength += word.length();}
double averageLength = totalLength/words.length;
System.out.println("The average length of the words is: "+ averageLength);
}
    }


