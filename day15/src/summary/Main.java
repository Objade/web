package summary;

public class Main {
	
	public static void main(String[] args) {
//		// 1) 상속 없는 클래스의 객체 생성
//		
//		Human h1 = new Human("황정민");
//		
//		// Cat과 Dog는 개별 클래스로 작성하세요.
//		Cat c1 = new Cat("구름이");
//		Dog d1 = new Dog("감자");
//		
//		h1.give(c1);	// 황정민이 구름이에게 먹이를 준다.
//		h1.give(d1);	// 황정민이 감자에게 먹이를 준다.
		
		
		// 2) 공통 특성을 가지는 Cat과 Dog를 슈퍼클래스 Animal을 상속받도록 처리하세요.
		// 공통의 작업은 하나의 생성자에서 처리하게 만드세요.
		// 이때, Human은 Cat과 Dog를 하나의 클래스 타입으로 처리할 수 있도록 변경하세요.
		
//		Human h1 = new Human("황정민");
//		
//		// Cat과 Dog는 개별 클래스로 작성하세요.
//		Cat c1 = new Cat("구름이");
//		Dog d1 = new Dog("감자");
//		
//		h1.give(c1);	// 황정민이 구름이에게 먹이를 준다.
//		h1.give(d1);	// 황정민이 감자에게 먹이를 준다.
//		
		
		
		// 3) 슈퍼클래스 Animal을 추상클래스로 만듭니다.
		// Animal의 서브클래스들은 타입에 맞는 먹이 종류를 지정하여 반환하는 함수 getFeed()를 가져야 합니다.
		
		
//		Human h1 = new Human("황정민");
//		
//		// Cat과 Dog는 개별 클래스로 작성하세요.
//		Cat c1 = new Cat("구름이");
//		Dog d1 = new Dog("감자");
//		
//		h1.give(c1);	// 황정민이 구름이에게 츄르를 준다.
//		h1.give(d1);	// 황정민이 감자에게 개껌을 준다.
		
		
		
		// 4) Human의 서브클래스 Friend를 작성하세요.
		// Cat과 Dog와 Friend는 서로 다른 슈퍼클래스를 가집니다.
		// Cat과 Dog와 Friend를 하나의 인터페이스로 묶어주고 필요한 작업을 처리하세요.
		
		
//		Human h1 = new Human("황정민");
//		
//		// Cat과 Dog는 개별 클래스로 작성하세요.
//		Cat c1 = new Cat("구름이");
//		Dog d1 = new Dog("감자");
//		Friend f1 = new Friend("하정우");
//		
//		h1.give(c1);	// 황정민이 구름이에게 츄르를 준다.
//		h1.give(d1);	// 황정민이 감자에게 개껌을 준다.
//		h1.give(f1);	// 황정민이 하정우에게 주먹밥을 준다.
		
		
		// 5) give의 매개변수에 들어오는 객체의 차이에 따라 주는 '방식' 을 구별하여 출력하세요.
		
		Human h1 = new Human("황정민");
		
		// Cat과 Dog는 개별 클래스로 작성하세요.
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("감자");
		Friend f1 = new Friend("하정우");
		
		h1.give(c1);	// 황정민이 구름이에게 츄르를 던져 준다.
		h1.give(d1);	// 황정민이 감자에게 개껌을 던져 준다.
		h1.give(f1);	// 황정민이 하정우에게 주먹밥을 건네 준다.
		
		
		
		
	}
}
