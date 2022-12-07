package week2.day2.assignments;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int number[]= {1,2,3,4,7,6,8};
         Arrays.sort(number);
         for (int i = 0; i < number.length; i++) {
			int number1=i+1;
			if (number[i]!=number1) {
				System.out.println(number1);
				break;
			}
		}
	}

}
