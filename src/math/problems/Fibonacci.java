package math.problems;

/*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
public class Fibonacci {
    public static void main(String[] args) {
         int fibNums = 40;
         int[] fibonacci = new int[fibNums];
         fibonacci[0] = 0;
         fibonacci[1] = 1;

         for (int i =2; i<fibNums; i++) {
             fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
         }
         for (int i =0; i<fibNums; i++){
             System.out.print(fibonacci[i]+ " ");
         }


    }
}
