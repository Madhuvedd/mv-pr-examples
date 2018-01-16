
public class GenderFactory {
	public Gender getGender(String gender) {
		if(gender.equalsIgnoreCase("male")){
			return new Male();
		}else if(gender.equalsIgnoreCase("female")){
			return new Female();
		}
		return null;
       
	}

}
