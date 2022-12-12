package week2.day4.assignments;

import java.util.Arrays;
import java.util.Iterator;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Second Largest Nuumber in array "+data[data.length-2]);

	}

}
