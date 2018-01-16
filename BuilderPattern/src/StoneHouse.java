public class StoneHouse implements HouseBuilder {

	private House house;

	public StoneHouse() {
		this.house = new House();
	}

	public void buildRoof() {
		System.out.println(" cement roof");
	}

	public void buildWall() {
		System.out.println(" stone wall");

	}
	
	public House getHouse() {
		return house;
	}

}
