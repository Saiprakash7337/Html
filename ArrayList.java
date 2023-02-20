package Week_3;

/*
 * (Maximum element in ArrayList) Write the following method that returns the 
maximum value in an ArrayList of integers. The method returns null if the 
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList {

	public static Integer maximum(ArrayList<Integer> list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		
		int maximum = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > maximum) {
				maximum = list.get(i);
			}
		}
		
		return maximum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of values to be inserted in arraylist");
		int a = sc.nextInt();
		System.out.println("Enter the values");
		
		for (int i = 0; i < a; i++) {
			int k = sc.nextInt();
			list.add(k);
		}
		
		Integer max = maximum(list);
		
		if (max == null) {
			System.out.println("Null");
		} else {
			System.out.println("Maximum element in array list is: " + max);
		}
	}	
}
