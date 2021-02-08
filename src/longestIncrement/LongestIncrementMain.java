package longestIncrement;

import java.util.ArrayList;
import java.util.Random;

public class LongestIncrementMain {

	public static void main(String[] args) {
		int n = 100;
		SequenceGenerator sg = new SequenceGenerator(n);
		int[] sequence = sg.generateSequence();
		
		for (int i: sequence) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		
		ArrayList<Integer> longest = sg.longestSubsequence();
		System.out.println("Longest Subsequence: " + longest.toString());
	}
	
}
