publci class{
  
  public static void main(String [] args){
  
          
//        Complete the function caffeineBuzz, which takes a non-zero integer as it's one argument.
//
//If the integer is divisible by 3, return the string "Java".
//
//If the integer is divisible by 3 and divisible by 4, return the string "Coffee"
//
//If the integer is one of the above and is even, add "Script" to the end of the string.
//
//Otherwise, return the string "mocha_missing!"
  
  }


}

public static String numberMethod(int n) // Daniel's Method
    {
        String temp = "";
        
        if((n%3) == 0)
        {
            if((n%4) == 0)
            {
                temp += "Coffee ";
            }
            else
            {
                temp += "Java ";
            }
        }
        
        if(!(temp.isEmpty()))
        {
            return temp + "Script ";
        }
        
            return "mocha_missing";
    }

    static String work(int x) { //juancarlos olivares
		if (x % 3 == 0 && x % 4 == 0) {
			if (x % 2 == 0) {
				return "Coffee Script";
			}
			return "Coffee";
		}
		if (x % 3 == 0) {
			if (x % 2 == 0) {
				return "Coffee Script";
			}
			return "Java";
		}
		return "mocha_missing!";
	}




	
	public static String caffeineBuzz (int n) // Thar's
	{
		if (n%12 == 0) 
			{
				return "java script";
			}
		if (n%6 ==0 )
			{
				return "coffee script";
			}
		if (n%3 ==0 _
			{
				return "java"; 
			}
		else 
			{
			 	return "mocha missing";
			}
			
	}
}
