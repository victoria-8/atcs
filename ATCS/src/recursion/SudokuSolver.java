package recursion;
import java.util.Arrays;

public class SudokuSolver {
    private final int[][] board;
    
   /**
     * All known values are added to the string, with 0's placed for unknown values.
     * @param board The String containing each cell in row-major order.
     */
    public SudokuSolver(String board) { // all one long string
   	 this.board=new int[9][9];
   	 for(int i=0; i<81; i++)
   		 this.board[i/9][i%9]=Integer.parseInt(board.charAt(i)+"");
    }
   /**
     * All known values are added to the string, with 0's placed for unknown values.
     * @param board The <code>int</code> array containing each row of cells.
     */
    public SudokuSolver(int[] board) { // row by row
   	 this.board=new int[9][9];
   	 for(int i=0; i<9; i++)
   		 for(int j=0; j<9; j++)
   			 this.board[i][j]=board[i]/(int)Math.pow(10, 8-j)%10;
    }
   /**
     * All known values are added to the string, with 0's placed for unknown values.
     * @param board The sudoku board, as it would be seen.
     */
    public SudokuSolver(int[][] board) { // the whole board
   	 this.board=board;
    }
    
   /**
     * Prints the board; and, a "Success!" or "Failure!", depending on whether or not the problem was solved.
     */
    public void printBoard() {
   	 System.out.println(isFinished()?"Success!":"Failure!");
   	 for(int[] x : board)
   		 System.out.println(Arrays.toString(x).replaceAll("[^1-9]", " "));
    }
    /**
     * Solves the provided sudoku board.
     * @return <code>this</code> SudokuSolver object (for use in chaining).
     */
    public SudokuSolver solve() {
   	 solve(0, 0);
   	 return this;
    }
    
    private boolean check(int n, int x, int y) {
   	 for(int i=x-1; i>=0; i--) // up
   		 if(board[i][y]==n)
   			 return false;
   	 for(int i=y-1; i>=0; i--) // left
   		 if(board[x][i]==n)
   			 return false;
   	 for(int i=x+1; i<9; i++) // down
   		 if(board[i][y]==n)
   			 return false;
   	 for(int i=y+1; i<9; i++) // right
   		 if(board[x][i]==n)
   			 return false;
   	 if(x%3==0) {
   		 if(y%3==0) { // top left
   			 for(int i=x; i<x+3; i++)
   				 for(int j=y; j<y+3; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 } else if(y%3==1) { // top centre
   			 for(int i=x; i<x+3; i++)
   				 for(int j=y-1; j<y+2; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 } else { // top right
   			 for(int i=x; i<x+3; i++)
   				 for(int j=y-2; j<y+1; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 }
   	 } else if(x%3==1) {
   		 if(y%3==0) { // centre left
   			 for(int i=x-1; i<x+2; i++)
   				 for(int j=y; j<y+3; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 } else if(y%3==1) { // centre by centre
   			 for(int i=x-1; i<x+2; i++)
   				 for(int j=y-1; j<y+2; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 } else { // centre right
   			 for(int i=x-1; i<x+2; i++)
   				 for(int j=y-2; j<y+1; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 }
   	 } else {
   		 if(y%3==0) { // bottom left
   			 for(int i=x-2; i<x+1; i++)
   				 for(int j=y; j<y+3; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 } else if(y%3==1) { // bottom centre
   			 for(int i=x-2; i<x+1; i++)
   				 for(int j=y-1; j<y+2; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 } else { // bottom right
   			 for(int i=x-2; i<x+1; i++)
   				 for(int j=y-2; j<y+1; j++)
   					 if((i!=x&&j!=y)&&board[i][j]==n)
   						 return false;
   		 }
   	 }
   	 return true;
    }
    private boolean isFinished() {
   	 for(int i=0; i<9; i++)
   		 for(int j=0; j<9; j++)
   			 if(!check(board[i][j], i, j))
   				 return false;
   	 return true;
    }
    private boolean solve(int x, int y) {
   	 if(x>8)
   		 return true;
   	 if(y>8)
   		 return solve(x+1, 0);
   	 if(board[x][y]==0) {
   		 for(int i=1; i<10; i++) {
   			 if(check(i, x, y)) {
   				 board[x][y]=i;
   				 if(solve(x, y+1)) // if it works, otherwise: try again with the next number
   					 return true; // it works
   			 }
   		 }
   		 board[x][y]=0;
   		 return false;
   	 }
   	 return solve(x, y+1);
    }
    
    public static void main(String[] args) {
   	 /*new SudokuSolver("123456789123456789123456789123456789123456789123456789123456789123456789123456789").printBoard();
   	 new SudokuSolver(new int[] {123456789, 123456789, 123456789, 123456789, 123456789, 123456789, 123456789, 123456789, 123456789}).printBoard();
   	 new SudokuSolver(new int[][] {
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9},
   			 {1, 2, 3, 4, 5, 6, 7, 8, 9}
   	 }).printBoard();*/
   	 
   	 new SudokuSolver(new int[][] {
   			 {2,6,0,0,0,8,0,4,0},
   			 {0,3,5,0,2,4,0,1,6},
   			 {0,0,1,0,7,3,2,0,5},
   			 {8,2,6,4,3,0,0,0,0},
   			 {5,0,0,8,0,0,7,2,4},
   			 {0,4,0,2,0,5,0,8,3},
   			 {0,0,0,3,4,0,5,7,2},
   			 {3,7,4,0,8,0,9,0,0},
   			 {9,0,2,7,0,6,4,0,0}
   	 }).solve().printBoard();
   	 new SudokuSolver(new int[][] {
   			 {2,6,6,6,6,8,0,4,0},
   			 {2,3,5,0,2,4,0,1,6},
   			 {2,0,1,0,7,3,2,0,5},
   			 {8,2,6,4,3,0,0,0,0},
   			 {5,0,0,8,0,0,7,2,4},
   			 {0,4,0,2,0,5,0,8,3},
   			 {0,0,0,3,4,0,5,7,2},
   			 {3,7,4,0,8,0,9,0,0},
   			 {9,0,2,7,0,6,4,0,0}
   	 }).solve().printBoard();
    }
}
