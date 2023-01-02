package week5.day5.assigments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> obj=new LinkedHashSet <String>();
		for (int i = 0; i < split.length; i++) {
			obj.add(split[i]);
			
			
		}
		System.out.println(obj);
	}

}
