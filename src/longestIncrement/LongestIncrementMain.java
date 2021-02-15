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
		
		Object[] longest = sg.longestSubsequence();
		System.out.print("Longest Subsequence: ");
		System.out.print("{ ");
		for (int i = 0; i < longest.length; i++) {
			System.out.print(longest[i] + " ");
		}
		System.out.print("}");
	}
	
}
