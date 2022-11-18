package abstractClass;

// 일반적인 클래스는 객체를 생성하기 위한 목적으로 작성함
// 추상적인 내용이 포함되면 객체화할 수 없음

//class Test1 {
//	public void function1() {
//		System.out.println("내용을 포함하는 구체적인 메서드");
//	}
//	
//	// public void function2();	// This method requires a body instead of a semicolon
//	
//	
//}

// 추상 클래스는 생성자를 통하여 직접 객체를 생성할 수 없음

abstract class Test1 {
	
	Test1() {
		System.out.println("Test1 생성자 호출!");
	}
	
	public void function1() {
		System.out.println("내용을 포함하는 구체적인 메서드");
	}
	
	public abstract void function2();
	
	
}


class Test2 extends Test1 {	// The type Test2 must implement the inherited abstract method Test1.function2()

	@Override	// 형식은 그대로 유지하면서 ,내용을 새로 작성하여 덮어쓴다.
	public void function2() {
		System.out.println("미구현 메서드를 구현한 내용");
		
	}
}



public class Ex01 {
	// 추상화 : 실제 객체의 몇몇 특성만 추출하여 프로그램 내에 반영함
	// 필드는 속성을 작성하고, 메서드는 기능을 표현하는데, 메서드의 구체적인 내용이 담기지 않을 수도 있음
	
	// 추상 메서드 : 형식은 정의되어 있으나, 내용은 정의되지 않은 메서드
	// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스(일반 메서드도 포함 가능함)
	
	
	public static void main(String[] args) {
		
//		Test1 ob1 = new Test1();	// Cannot instantiate the type Test1
									// 추상 클래스의 생성자는 직접 호출할 수 없음
									// -> 객체화가 불가능함
		
		Test2 ob2 = new Test2();
		ob2.function1();	// 직접적인 객체 생성은 불가능하지만, 상속을 통한 간접적인 객체 생성은 가능.
		ob2.function2();
		
		
	}

}
