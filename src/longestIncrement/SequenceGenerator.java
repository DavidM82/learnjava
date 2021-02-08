package longestIncrement;

import java.util.ArrayList;

public class SequenceGenerator {
	
	private int n;
	private int[] array;
	
	public SequenceGenerator(int n) {
		this.n = n;
		array = new int[100];
	}
	
	public int generateInt() {
		double randomNumber = Math.random();
		int randomInt = (int) (randomNumber * 100);
		
		return randomInt;
	}

	public int[] generateSequence(){
		
		for (int i = 0; i < n; i++) {
			array[i] = this.generateInt();
		}
		
		return array;
	}
	
	public ArrayList<Integer> longestSubsequence(){
		ArrayList<Integer> longest = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int i: array) {
			if (temp.size() == 0) {
				temp.add(i);
				continue;
			}
			if (temp.get(temp.size()-1) >= i) {
				//System.out.println(i + " is less than " + temp.get(temp.size()-1));
				if (temp.size() > longest.size()) {
					longest.clear();
					for(int j: temp) {
						longest.add(j);
					}
					//System.out.println("longest array is now: " + longest);
				}
				temp.clear();
			}
			temp.add(i);	
		}
		return longest;
	}
}
