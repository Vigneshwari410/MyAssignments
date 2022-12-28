package week5.day2.assignment;

public class Automation extends MultipleLanguage  implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj= new  Automation();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

}
