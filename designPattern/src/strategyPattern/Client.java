package strategyPattern;

public class Client {
	
	public static void main(String[] args) {
		
		// 객체 주입 
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		// 무기: 총
		strategy = new StrategyGun();
		rambo.runContext(strategy);
		
		// 무기: 검
		strategy = new StrategySword();
		rambo.runContext(strategy);
		
		// 무기: 화살
		strategy = new StrategyBow();
		rambo.runContext(strategy);
		
	
	}

}
