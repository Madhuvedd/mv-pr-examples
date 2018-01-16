public class Engineer {
	HouseBuilder houseBuilder;

	public Engineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse() {
		houseBuilder.buildRoof();
		houseBuilder.buildWall();

	}
	
	public House getHouse() {
		return houseBuilder.getHouse();
	}

}
