package week1.day2;

public class TwoWheeler {
	int noOfWheels =2;
	short noOfMirrors =2;
	long chassisNumber=12345678908l;
	boolean isPunctured=false;
	String bikeName="Royal Enfield Bullet";
	double runningKM=34598.43;

public static void main(String[] args) {
	
	TwoWheeler myBike=new TwoWheeler();
	System.out.println("noOfWheels "+myBike.noOfWheels);
	System.out.println("noOfMirrors "+myBike.noOfMirrors);
	System.out.println("chassisNumber "+myBike.chassisNumber);
	System.out.println("isPunctured "+myBike.isPunctured);
	System.out.println("bikeName "+myBike.bikeName);
	System.out.println("runningKM "+myBike.runningKM);
}
}
