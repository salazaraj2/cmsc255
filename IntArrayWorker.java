/* Alec Salazar
 * CMSC255-901
 * 2014APR05
 * IntArrayWorker
 */
public class IntArrayWorker{
	/** two dimensional matrix */
	private int[][] matrix = null;
  
	/** set the matrix to the passed one
	 * @param theMatrix the one to use
	 */
	public void setMatrix(int[][] theMatrix){
		matrix = theMatrix;
	}

	/** Method to return the summation of values in the array 
	 * @return the sum of the values in the array
	 */
	public int getTotal(){
		int total = 0;
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[0].length; col++){
				total = total + matrix[row][col];
			}
		}
		return total;
	}
 
	/** Method to return the total using a nested for-each loop
	 * @return the total of the values in the array
	 */
	public int getTotalNested(){
		int total = 0;
		for (int[] rowArray : matrix){
			for (int item : rowArray){
				total += item;
			}
		}
		return total;
	}

	/** Method to tally the occurrences of the passed-in value
	 * @param waldo value to seek and tally
	 * @return tally number of times waldo was found in the matrix
	 */
	public int getCount(int waldo){
		int tally = 0;
		for(int[] rowArray : matrix){
			for(int item : rowArray){
				if(item == waldo) tally++;
			}
		}
		return tally;
	}

	/** Method to find the largest value in a given array
	 * @return largest int
	 */
	public int getLargest(){
		int largest = matrix[0][0];
		for(int[] rowArray : matrix){
			for(int item : rowArray){
				if(item > largest) largest = item;
			}
		}
		return largest;
	}

	/** Method to sum the values in a given column
	 * @param col column to sum
	 * @return int sum of column values
	 */
	public int getColTotal(int col){
		int colTotal = 0;
		for(int row = 0; row < matrix.length; row++){
			colTotal += matrix[row][col];
		}
		return colTotal;
	}

	/** Method to fill with an increasing count
	 */
	public void fillCount(){
		int numCols = matrix[0].length;
		int count = 1;
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < numCols; col++){
				matrix[row][col] = count;
				count++;
			}
		}
	}
  
	/** print the values in the array in rows and columns
	 */
	public void print(){
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[0].length; col++){
				System.out.print( matrix[row][col] + " " );
			}
			System.out.println();
		}
		System.out.println();
	}

	/** fill the array with a pattern 
	 */
	public void fillPattern1(){
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[0].length; col++){
				if (row < col) matrix[row][col] = 1;
				else if (row == col) matrix[row][col] = 2;
				else matrix[row][col] = 3;
			}
		}
	}
}
