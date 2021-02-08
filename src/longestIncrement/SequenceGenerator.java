package longestIncrement;

import java.util.ArrayList;

public class SequenceGenerator {
	
	private int n;
	private ArrayList<Integer> array;
	
	public SequenceGenerator(int n) {
		this.n = n;
		array = new ArrayList<Integer>();
	}
	
	public int generateInt() {
		double randomNumber = Math.random();
		int randomInt = (int) (randomNumber * 100);
		
		return randomInt;
	}

	public ArrayList<Integer> GenerateSequence(){
		array.clear();
		
		for (int i = 0; i < n; i++) {
			array.add(this.generateInt());
		}
		
		return array;
	}
}
