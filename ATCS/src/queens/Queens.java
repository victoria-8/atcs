package queens;

public class Queens {

	private int[][] board;
	private int size;
	private int numOutputs = 0;
	
	public Queens(int size) {

		board = new int[size][size];
		this.size = size;
	}
	
	
	public boolean solve(int row)
	{
		if (row >= size)
		{
			displayBoard();
			numOutputs++;
			System.out.println();
			System.out.println("Solution #" + numOutputs);
		}
			
		for (int col = 0; col < size; col++)
		{
			
				if (canPlace(row,col))
				{
					board[row][col] = row+1; //row+1 = queen number
					if (!solve(row+1))
					{
						board[row][col] = 0; //backtracking

					}
					else
						return true;
				}
			
			
			
		}
		return false;
	}

	private boolean canPlace(int i, int j) 
	{
		
		 //check column
		 for (int y = 0; y < size; y++)
		 {
			 if (board[y][j] != 0)
				 return false;
		 }
		 //check (upper) diagonals
		 int row = i-1;
		 int col = j-1;
		 while(row >= 0 && col >= 0)
		 {
			 if (board[row--][col--] != 0)
				 return false;
		 }
		 
		 row = i-1;
		 col = j+1;
		 while (row >= 0 && col < size)
		 {
			 if (board[row--][col++] != 0)
				 return false;
		 }
		 return true;
	}
	
	 
	public void displayBoard() 
	{
		for (int[] row : board) 
		{
			for (int col : row)
			{
				if (col != 0)
					System.out.print(col + " ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}

	}
	
}