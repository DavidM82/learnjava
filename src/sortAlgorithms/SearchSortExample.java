package sortAlgorithms;

import java.util.ArrayList;

public class SearchSortExample {

	public int LinearSearch() {
		
		System.out.println("Searching for number 1000 in arrayList");
		int numToSearch = 1000;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1); al.add(2); al.add(1000);
		
		for (int i: al) {
			if (i == numToSearch) {
				System.out.println("Found " + i); return i;
			}
		}
		return 0;
	}
	
	public int BinarySearch() {
		System.out.println("Searching for number 4 in arrayList");
		int numToSearch = 4;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1); al.add(2); al.add(3); al.add(4); al.add(5);
		int i = al.size() / 2; 
		
		while (i < al.size() && i > 0) {
			System.out.println(i);
			if (al.get(i) == numToSearch) {
				System.out.println("Got it!");
				return al.get(i);
			}
			if (al.get(i) < numToSearch) {
				i += ((al.size() - i) / 2);
			} else {
				i -= (i/2);
			}
		}
		
		return 0;
	}
	
	public void BubbleSort() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3); al.add(1); al.add(4); al.add(2); al.add(6); al.add(5);
		boolean changed;
		
		do {
			changed = false;
			for (int i = 0; i < al.size()-1; i++) {
				if (al.get(i) > al.get(i+1)) {
					int old = al.get(i);
					al.set(i, al.get(i+1));
					al.set(i+1, old);
					changed = true;
				}
				
			}
			System.out.println("Went through Array");
		} while (changed);
		
		System.out.println(al);
	}	
}
