//Link:-https://www.codingninjas.com/codestudio/problems/print-like-a-wave_893268

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int col = 0; col < mCols; col++)
		{
			if (col % 2 != 0) //(col & 1) != 0
			{
				for (int row = nRows - 1; row >= 0; row--)
				{
					ans.add(arr[row][col]);
				}
			}
				else
				{
					for (int row = 0; row < nRows; row++)
					{
						ans.add(arr[row][col]);
					}
				}
		}
		int[] arr1 = ans.stream().mapToInt(i -> i).toArray();
		return arr1;
	}
}
