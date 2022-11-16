package reference;

class Unit5{
	String name;		// 이름
	int atk;			// 공격력
	int hp;				// 체력
}

public class Ex05 {
	private static void attack(Unit5 attacker, Unit5 target) {
		target.hp -= attacker.atk;
		
	}
		// 대입 연산을 attack이라는 함수로 구성했다면...
		
		public static void main(String[] args) {
			Unit5 ob1 = new Unit5();
			ob1.name = "마린";
			ob1.atk = 5;
			ob1.hp = 40;
			
			Unit5 ob2 = new Unit5();
			ob2.name = "저글링";
			ob2.atk = 6;
			ob2.hp = 35;
			
			while(ob1.hp > 0 && ob2.hp > 0) {
				attack(ob1, ob2);	// 마린이 저글링을 공격했다.
				
				attack(ob2, ob1); // 저글링이 마린을 공격했다.
				
				System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
				System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
				System.out.println();
				
			}
			
			
		}

	

	}

