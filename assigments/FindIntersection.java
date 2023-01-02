package week5.day5.assigments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		 int[] b={1,2,8,4,9,7};
		 List <Integer> data=new ArrayList<Integer> ();
		 List <Integer> data1=new ArrayList<Integer> ();
		 for (int i = 0; i < a.length; i++) {
			 data.add(a[i]);
			 for (int j = 0; j < b.length; j++) {
				data1.add(b[j]);
				if (a[i]==b[j]) {
					System.out.println(a[i]);
					
				}
			}
			 
			
		}

	}

}
