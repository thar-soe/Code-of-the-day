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
  
  public static void sumPosNeg(int[] a)   //Esther's method
	{
		int sumP = 0;
		int sumN = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > 0)
			{
				sumP = sumP + a[i];
			}
			else
			{
				sumN = sumN + a[i];
			}
		}
		
		System.out.println("Positive: " + sumP);
		System.out.println("Negative: " + sumN);
	}
	
	public static void Second(int [] array) // Martin's method
	  {
		  int positive = 0, negative = 0;
	      for(int i = 0; i < array.length; i++)
	      {
	    	  	if(array[i] >= 0)
	    	  	{
	    	  		positive = positive + array[i];
	    	  	}
	    	  	else
	    	  	{
	    	  		negative = negative + array[i];
	    	  	}
	      }
	      
	      System.out.println("Positive sum: " + positive);
	      System.out.println("Negative sum: " + negative);
	  }

}
