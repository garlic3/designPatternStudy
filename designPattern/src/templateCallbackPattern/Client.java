package templateCallbackPattern;

public class Client {

	
	public static void main(String[] args) {
		
		
		Soldier rambo = new Soldier();
		
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("탕탕");
				
			}
		});
		
		System.out.println();
		
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("쳉쳉");
				
			}
		});
		
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("슉슉");
				
			}
		});
		
	}
}
