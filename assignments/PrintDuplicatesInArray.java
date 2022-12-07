package week2.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
        int length=number.length;
        for (int i = 0; i <length-1; i++) {
        	int count=1;
        	for (int j = i+1; j <length-1; j++) {
        		count=count+1;
        		if (number[i]==number[j]) {
					System.out.println(number[i]);
				}
				
			}
			
		}
	}

}
