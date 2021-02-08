package longestIncrement;

import java.util.ArrayList;
import java.util.Random;

public class LongestIncrementMain {

	public static void main(String[] args) {
		int n = 100;
		SequenceGenerator sg = new SequenceGenerator(n);
		ArrayList<Integer> sequence = sg.GenerateSequence();
		
		for (int i: sequence) {
			System.out.print(i + " ");
		}
	}
}
