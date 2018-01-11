public class Second{
  
  public static void main(String []args)
  {
      // Make a method that accepts an int array and 
      //Print 2 sums : one for postives and one for negatives
      //
      //output:
      //positive: ##
      //negative: ##
      int [] array = {2,4,6,-5,7,2,-5,6,10,-35,66};
      
  }
  public static void (int [] array) // Alvaro' method
  {
      
      
      
  }
  
  public static void print2Sums(int[] arr) {  //Kevin's Method
        int posSum = 0, negSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum += arr[i];
            } else {
                negSum += arr[i];
            }
        }
        System.out.println("Sum of Positives: " + posSum + "\nSum of Negatives: " + negSum);
    }



}
