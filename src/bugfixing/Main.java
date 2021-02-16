package bugfixing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc = null;
	private static String[] arr = {"1. I wish to review my expenditure", "2. I wish to add my expenditure",
            "3. I wish to delete my expenditure", "4. I wish to sort the expenditures",
            "5. I wish to search for a particular expenditure", "6. Close the application"};;
	private static ArrayList<Integer> expenses = new ArrayList<Integer>(Arrays.asList(1000, 2300, 45000, 32000, 110));
    private static boolean isSorted = false;        
            
    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        sc = new Scanner(System.in);
        optionsSelection();
    }
    
    private static void optionsSelection() {
    	System.out.println("\n");
        for(int i=0; i<arr.length;i++) { System.out.println(arr[i]); }
        
        System.out.print("\nEnter your choice: ");
        int  options = sc.nextInt();
        
        switch (options){
        	case 1:
        		System.out.println("Your saved expenses are listed below: \n");
                System.out.println(expenses+"\n");
                optionsSelection();
                break;
            case 2:
                System.out.println("Enter the value to add your Expense: \n");
                int value = sc.nextInt();
                expenses.add(value);
                System.out.println("Your value is updated\n");
                System.out.println(expenses+"\n");
                isSorted = false;
                optionsSelection();
                break;
            case 3:
                System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                int con_choice = sc.nextInt();
                if(con_choice==options){
                    expenses.clear();
                    System.out.println("All your expenses are erased!");
                } else {
                	System.out.println("Expenses not deleted.");
                }
                optionsSelection();
                break;
            case 4:
            	sortExpenses(expenses);
            	isSorted = true;
            	System.out.println("Expanses sorted!");
            	optionsSelection();
            	break;
            case 5:
            	if (expenses.size() > 0) {
                	searchExpenses(expenses);            		
            	} else {
            		System.out.println("The list is empty! There's no values to search for.");
            	}
            	optionsSelection();
            	break;
            case 6:
            	closeApp();
            	break; // <-- unreachable unless closeApp() is modified.
            default:
            	System.out.println("You have made an invalid choice!");
                optionsSelection();
        }

    }
    
    private static void closeApp() {
    	sc.close();
    	System.out.println("Closing your application... \nThank you!");
        System.exit(1);
    }
    
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.print("Enter the expense you need to search: ");
        int num = sc.nextInt();
        
        if (isSorted) {
        	System.out.println("List is sorted, this'll be quick!");
        	//Binary Search
        	int result = binarySearch(arrayList, num, 0, arrayList.size());
        	if (result == -1) {
        		System.out.println("Expanse not found.");
        	} else {
        		System.out.println("Expanse found at position: " + result + "!");
        	}
        	
        } else {
        	System.out.println("List is not sorted, this'll take a bit..");
        	//Linear search
        	int i = 1;
        	for (int j: expenses) {
        		if (j == num) {
        			System.out.println("Expanse found at position: " + i + "!");
        			return;
        		}
        		i++;
        	}
        	System.out.println("Expanse not found.");
        }
    }
    
    private static int binarySearch(ArrayList<Integer> arr, int key, int low, int high) {
    	if (high < low) { return -1; }
    	int middle = (low+high)/2;
    	if (key == arr.get(middle)) { return middle+1;} 
    	else if (key < arr.get(middle)) {
    		return binarySearch(arr,key, low, middle-1);
    	} else {
    		return binarySearch(arr,key,middle+1, high);
    	}    	
    }
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
        //Expenses sorted in ascending order using MergeSort
        if (arrlength < 2) { return; }
        
        int mid = arrlength/2;
        ArrayList<Integer> lower = new ArrayList<Integer>();
        ArrayList<Integer> higher = new ArrayList<Integer>();
        
        for (int i = 0; i < mid; i++) {
        	lower.add(arrayList.get(i));
        }
        for (int i = mid; i < arrlength; i++) {
        	higher.add(arrayList.get(i));
        }
        
        sortExpenses(lower);
        sortExpenses(higher);
        
        merge(arrayList, lower, higher, mid, arrlength-mid);
    }
    
    private static void merge(ArrayList<Integer> arr, ArrayList<Integer> lower, ArrayList<Integer> higher, int left, int right) {
    	int i = 0, j = 0, k = 0;
    	while (i < left && j < right) {
    		if(lower.get(i) <= higher.get(j)) {
    			arr.set(k++, lower.get(i++));
    		} else {
    			arr.set(k++, higher.get(j++));
    		}
    	}
    	while (i < left) {
    		arr.set(k++, lower.get(i++));
    	}
    	while (j < right) {
    		arr.set(k++, higher.get(j++));
    	}
    }
}