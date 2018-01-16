
public class tuesday {
    
    public static void main(String[] args) {
        
        //
        
        
        
        
        String str = " 2 5 6 7 4 3";
        
        method(str);
        
    }
    public static int [] method(String str) // Alvaro's method
    {
        int length = 0;
        for (int i = 0; i < 10; i++) {
            
            String letter = str.substring(i, i+1);
            if (letter.equals(" ")) {
                length++;      
            }
        }
        length++;
        int num[] = new int[length];
        
    
        for (int i = 0,j=0; i < str.length(); i++) {
            
            String ch = str.substring(i,i+1);
            
            if(ch.matches("[0-9]"))
            {
                num[j] = Integer.parseInt(str.substring(i,i+1));
                j++;
            }
                
        }
        
        //for (int i = 0; i < num.length; i++) {
        //    System.out.println(num[i]);
        //}
        
        return num;
    }
}
