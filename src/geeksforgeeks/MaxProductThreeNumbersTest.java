package geeksforgeeks;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxProductThreeNumbersTest {

	@Test
	public void test() {
		
		int[] expected1 = {5,3,9};
		int[] aaa = {5,3,1,9};
		
		int[] expected2 = {-90,-3,9};
		int[] negative = {9, -1, -3, -90, 8, 4};

		int[] ans = MaxProductThreeNumbers.getMaxThreeNumbers(aaa);
		Arrays.sort(expected1);
		Arrays.sort(ans);
		assertArrayEquals(expected1, ans);
		
		int[] ans2 = MaxProductThreeNumbers.getMaxThreeNumbers(negative);
		Arrays.sort(expected2);
		Arrays.sort(ans2);
		assertArrayEquals(expected2, ans2);
		
	}

}
