
public class SingltonDemo {
	public static void main(String[] args) {
		Singlton singleObj = Singlton.getInstance();
		System.out.println(" obj "+singleObj);
		
		Singlton sec = Singlton.getInstance();
		System.out.println(sec);
	}

}
