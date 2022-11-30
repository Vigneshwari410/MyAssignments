package week1.day2;

public class Mobile {
	String mobileBrandName="Samsung";
	char mobileLogo='S';
	short noOfMobilePiece=30;
	int modelNumber=30;
	long mobileImeiNumber=9876543210l;
	float mobilePrice=30000.00f;
	boolean isDamaged=false;

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		System.out.println("mobileBrandName "+mobile.mobileBrandName);
		System.out.println("mobileLogo "+mobile.mobileLogo);
		System.out.println("noOfMobilePiece "+mobile.noOfMobilePiece);
		System.out.println("modelNumber "+mobile.modelNumber);
		System.out.println("mobileImeiNumber "+mobile.mobileImeiNumber);
		System.out.println("mobilePrice "+mobile.mobilePrice);
		System.out.println("isDamaged "+mobile.isDamaged);
		

	}

}
