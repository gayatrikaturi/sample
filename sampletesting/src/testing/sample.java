package testing;

public class sample {
   public String remove(String str)
   {
	   if(str.charAt(0)=='A')
       {
           if(str.charAt(1)=='A')  return str.substring(2);  
           else  return str.substring(1);
       }
      else if(str.charAt(1)=='A') return str.charAt(0)+str.substring(2);
      else return str;
   }
}
