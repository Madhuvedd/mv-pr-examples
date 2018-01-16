
public class Demo {
	public static void main(String[] args) {
		GenderFactory genderFactory = new GenderFactory();
		
		Gender g1 = genderFactory.getGender("male");
		System.out.println(" g 1 == "+g1.genderType());
		
		Gender g2 = genderFactory.getGender("female");
		System.out.println("g2 === "+  g2.genderType());
	}

}
 