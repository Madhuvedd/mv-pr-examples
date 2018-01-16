
class Singlton {
	
	private static Singlton singltonObj;
	
	private Singlton(){
		
	}
	
	public static Singlton getInstance(){
		if(singltonObj == null){
			singltonObj = new Singlton();
			return singltonObj;
		}else{
			return singltonObj;
		}		
	}
}