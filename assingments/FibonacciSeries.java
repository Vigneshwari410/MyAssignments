package week2.day1.assingments;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int firstNumber=0;
        int secondNumber=1;
        int sum;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
       
        for (int i = 1; i < 7; i++) {
        	sum=firstNumber+secondNumber;
        	System.out.println(sum);
        	firstNumber=secondNumber;
        	secondNumber=sum;
			
		}
	}

}
