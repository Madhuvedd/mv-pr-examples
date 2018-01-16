public class House implements HousePlan {
	String roof;
	String wall;

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public House getHouse() {
		return new House();
	}

}
