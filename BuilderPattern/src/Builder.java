
public class Builder {
	
	public static void main(String[] args) {
		HouseBuilder mudHouse = new MudHouse();
		Engineer eng = new Engineer(mudHouse);
		
		House house = eng.getHouse();
		System.out.println( " house "+house);
	}

}
