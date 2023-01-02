package week5.day5.assigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set <Integer> obj=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			obj.add(data[i]);
			
		}
		List <Integer>obj2=new ArrayList<Integer>(obj);
		System.out.println(obj2.get(obj2.size()-2));

	}

}
