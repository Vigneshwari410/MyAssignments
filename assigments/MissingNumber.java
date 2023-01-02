package week5.day5.assigments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
public static void main(String[] args) {
	int[]data = {2,5,10,7,1,8,3,9,6};
	Set<Integer>obj=new TreeSet<Integer>();
	for (int i = 0; i < data.length; i++) {
		obj.add(data[i]);
		
	}
	int number=0;
	for (int j = 1; j <=obj.size(); j++) {
		if (!obj.contains(j)) {
			number=j;
			System.out.println(number);
			break;
			
		}
	}	
}
}
