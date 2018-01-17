public class String2Array 
{
	public static void main(String[] args)
	{
		String positive = "1 343223 212 872 35";
		int[] a = converter(positive);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] converter(String positive) 
	{
		int spaceCounter = 0;
		for(int i = 0; i < positive.length(); i++) //counts number of spaces in string
		{
			if(positive.charAt(i) == ' ')
			{
				spaceCounter++;
			}
		}
		
		int intArray[] = new int[spaceCounter+1];
		
		int first, last;
		int stringCounter = 0, arrayCounter = 0;
		
		do 
		{
			first = stringCounter;
			try
			{
			
				do
				{
					stringCounter++;
				}while(positive.charAt(stringCounter) != ' '); //increments through string while there is no ' '
			}
			catch(Exception e)
	        {
	            
	        }
			last = stringCounter;
			String number = positive.substring(first, last);
			intArray[arrayCounter++] = Integer.parseInt(number);
			stringCounter++;
		}while(stringCounter < positive.length() && stringCounter < positive.length());
		
		return intArray;
	}
}
	
