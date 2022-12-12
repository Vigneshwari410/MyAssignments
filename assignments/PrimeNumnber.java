package week2.day4.assignments;

public class PrimeNumnber {
	public static void main(String[] args) {
		int number=13;
		boolean flag =false;
		for (int i = 2; i < number/2; i++) {
			if (number%i==0) {
				flag=true;
				break;
				
			}
		}
		if (!flag) {
			System.out.println(number+" is a Prime number");
			
		}
		else {
			System.out.println(number+" is a not Prime number");
		}
		
	}

}
