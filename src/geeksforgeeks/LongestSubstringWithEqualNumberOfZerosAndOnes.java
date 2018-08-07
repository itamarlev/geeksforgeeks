package geeksforgeeks;

import java.util.HashMap;
import java.util.Scanner;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s= new Scanner(System.in);
	 int t=s.nextInt();
	 
	 while(t>0)
	 {
	     String str=s.next();
	     HashMap<Integer,Integer> map=new HashMap<>();
	     
	     int countOne=0;
	     int countZero=0;
	     int max=-1;
	     for(int i=0;i<str.length();i++)
	     {
	         if(str.charAt(i)=='0')
	         countZero++;
	         else
	         countOne++;
	         
	         if(map.containsKey(countOne-countZero) || countOne-countZero==0)
	         {
	             if(countOne-countZero==0)
	             {
	                 max=Math.max(i+1,max);
	             }
	             else if(max<(i-map.get(countOne-countZero)))
	             {
	                 max=i-map.get(countOne-countZero);
	             }
	         }
	         else
	         map.put(countOne-countZero,i);
	     }
	     
	     System.out.println(max);
	    t--;    
	 }
	 
	 }
}
