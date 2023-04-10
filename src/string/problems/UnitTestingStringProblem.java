package string.problems;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class UnitTestingStringProblem {
    //Apply Unit Test into all the methods in this package.

//Anagram
    @Test
    public void testCheckAnagram() {
        assertTrue(Anagram.checkAnagram("tokyo", "kyoto"));
        assertFalse(Anagram.checkAnagram("abc", "cde"));
    }

   //DetermineLargestWord
//    @Test
//    public void testDetermineLargestWord(){
//        String wordsGiven = "this is unit testing";
//        Map<Integer, String> result = DetermineLargestWord.findTheLargestWord(wordsGiven);
//        assertEquals(7, result.keySet().iterator().next());
//        assertEquals("testing", result.get(7));
//    }
//DuplicateWord
//Palindrome
@Test
    public void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("dad"));
        assertTrue(Palindrome.isPalindrome("wasitacatisaw"));
        assertFalse(Palindrome.isPalindrome("madman"));
        assertFalse(Palindrome.isPalindrome("qwertyq"));
}}

    //Permutation
//    @Test
//    }

