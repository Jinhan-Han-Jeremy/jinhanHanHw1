package hw1;

public class Strings
{
   public static String uniqueLetters(String str)
   {
       String result = "";
        for(int i = 0; i < str.length(); ++i)
        {
            int counter = 0;
            
            for(int j = 0; j < str.length(); ++j)
            {
                if(str.charAt(j) == str.charAt(i))
                    counter++;
            }
            
            if(counter == 1)
               result += str.charAt(i);
            
        }
        return result;
   }
}