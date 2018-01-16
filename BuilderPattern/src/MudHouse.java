public class MudHouse implements HouseBuilder {

	private House house;

	public MudHouse() {
		this.house = new House();
	}

	public void buildRoof() {
		System.out.println(" wooden roof ");

	}

	public void buildWall() {
		System.out.println(" mud wall");
	}

	public House getHouse() {
		return house;
	}

}
