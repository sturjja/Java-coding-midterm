package math.problems;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTestingMath {
    //Apply Unit testing into each class and methods in this package.

// Factorial
@Test
    public void testFactorial() {
        assertEquals(720, Factorial.factorialRecursion(6));
    }
 //Fibonacci
 @Test
 public void testFibonacci(){
    int fibNums =10;
    int[] expected = new int[]{0,1,1,2,3,5,8,13,21,34};
    int[]actual = new int [fibNums];

    actual[0] = 0;
    actual[1] =1;
    for(int i=2; i<fibNums; i++){
        actual[i] = actual[i-1] + actual[i-2];
    }
    assertArrayEquals(expected,actual);
 }
 //FindLowestDifference
    @Test
    public void testFindLowestDifference(){
    int[] array1 = {30,6,12};
    int[] array2 = {28,17,20};
    int expected = 2;
    int actual = FindLowestDifference.findLowestDifference(array1, array2, array1.length, array2.length);

        assertEquals(expected, actual);
    }

    //FindMissingNumber
    @Test
    public void testFindMissingNumber(){
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        int missingNumber = FindMissingNumber.findMissingNumber(array);
        assertEquals(10, missingNumber);
    }
    //LowestNumber@Test
    //MakePyramid@Test public void testMakePyramid(){}
    //Pattern@Testpublic void testPattern(){}
    //PrimeNumber@Testpublic void testPrimeNumber(){}
}
