package reference;



public class Test2 {
	public static void main(String[] args) {
		Unit ob1 = new Unit("마린", 5, 0, 40);
		
		Unit ob2 = new Unit("저글링", 6, 0, 35);
		
		
		while(ob1.getHp() > 0 && ob2.getHp() > 0) {
			// ob2.hp = ob2.hp - (ob1.atk - ob2.def);			
			ob1.attack(ob2);	// 마린이 저글링을 공격했다.
			
			// ob1.hp = ob1.hp - (ob2.atk - ob1.def);			
			ob2.attack(ob1);	// 저글링이 마린을 공격했다.
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.getName(), ob1.getHp());
			System.out.printf("ob2 : [%s, %d]\n", ob2.getName(), ob2.getHp());
			System.out.println();
			
		}
		
		
	}

	
	
	
}
