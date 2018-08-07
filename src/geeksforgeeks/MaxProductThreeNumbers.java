package geeksforgeeks;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaxProductThreeNumbers {

	public static int[] getMaxThreeNumbers(int[] numbers)
	{
		if(numbers.length < 3)
			return null;
		
		int[] posNumbers = {0,0,0};
		int[] negativeNumbers = {0,0};
	
				
		for(int num : numbers)
		{
			if(num == 0)
				continue;
			if(num > 0 && num > posNumbers[0])
			{
				posNumbers[0]=num;
				Arrays.sort(posNumbers);
			}
			
			if(num < 0 && num < negativeNumbers[1])
			{
				negativeNumbers[1]=num;
				Arrays.sort(negativeNumbers);
			}
		}

		int sum = posNumbers[0] * posNumbers[1] * posNumbers[2];
		int alternativeSum = negativeNumbers[0]*negativeNumbers[1]*posNumbers[2];
		
		int[] ans = new int[3]; 
		if( alternativeSum > sum)
		{
			return new int[] {negativeNumbers[0],negativeNumbers[1],posNumbers[2]};
		}
		else
		{
			return posNumbers;
		}	
		
	}

}
