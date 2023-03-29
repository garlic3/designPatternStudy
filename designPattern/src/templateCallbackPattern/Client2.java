package templateCallbackPattern;

public class Client2 {

	
	public static void main(String[] args) {
		
		
		Soldier2 rambo = new Soldier2();
		
		rambo.runContext("총총");
		System.out.println();
		
		rambo.runContext("칼칼");
		System.out.println();
		
		rambo.runContext("활활");
		System.out.println();
		
	
	}
}
