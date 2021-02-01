package collections.arrays;

public class ArrayExample {

	private int checkerboard[][] = new int[8][8];
	
	public ArrayExample() {
		initializeArray();
	}
	
	private void initializeArray() {
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j <  8; j++) {
				checkerboard[i][j]=0;
			}
		}
	}
	
	public void setupGame() {
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i < 3) && (j%2 == 0)) {
					checkerboard[i][j] = 1; 
				} else if ((i>4) && (i < 8)) {
					checkerboard[i][j] = 2;
				} 
				checkerboard[i][j] = 0;
			}
		}
	}
	
	public void printBoard() {
		System.out.println("Board: ");
		
		for (int i = 0; i < 8; i++) {
			StringBuffer buffer = new StringBuffer();
			for (int j = 0; j < 8; j++) {
				buffer.append(" " + String.valueOf(checkerboard[i][j]) + " "); 
			}
			System.out.println(buffer.toString());
		}
	}
}
