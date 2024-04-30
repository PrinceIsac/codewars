public class OutlierProblem {
   public  static void main(String[] arg ){
      int[] numbers = {2, 4, 0, 100, 4, 11, 2602, 36};
      System.out.println(find(numbers));
   }
/*
*
* You are given an array (which will have a length of at least 3, but could be very large) containing integers.
* The array is either entirely composed of odd integers or entirely composed of even integers except for a single integer N.
* Write a method that takes the array as an argument and returns this "outlier" N.

   [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

   [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)*/
   static int find(int[] integers) {
      int evenNumbersCount = 0;
      boolean isOutlierEven = false;
//      Get the first three numbers
      int[] firstThreeNumbers = {integers[0],integers[1],integers[2]};

//      Check if we have two even numbers to decide whether the outlier is Even or Odd
      for(int x = 0; x < 3; x++){
         if(firstThreeNumbers[x] % 2 == 0){
            evenNumbersCount++;
         }
      }

      if(evenNumbersCount > 1){
         isOutlierEven = true;
      }

//      Search for the outlier and return it
      for(int i  = 0; i < integers.length; i++){
         if(isOutlierEven && integers[i] % 2 != 0){
            return integers[i];
         }else if(!isOutlierEven && integers[i] % 2 == 0){
            return integers[i];
         }
      }
      return 0;
   }


}
