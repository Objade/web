package abstractClass;

// interface 는 추상클래스의 일종임
// interface 의 모든 필드는 public static final 임
// interface 의 모든 메서드는 public abstract 임
// interface 는 extends가 아니라, implements 키워드로 상속처리함
// -> 인터페이스를 구현한다라고 표현함

// interface는 자바에서 유일하게 다중 상속을 허용하는 형식임

interface Test3 {
	int n1 = 10;	// 필드의 초기값을 반드시 지정해야함
					// 따로 형식을 작성하지 않았지만, 자동으로 형식이 지정되어 있음
	public static final int n2 = 20;
	// static 이므로 어떤 객체에서 접근해도 동일한 값임
	// final 이므로 한번 지정된 값은 변경할 수 없으며, 반드시 초기값을 지정해야만 함
	
	void method1();		// public abstract이므로 body를 작성할 수 없음
//	void method2() {
//		// Abstract methods do not specify a body
//	}
	static void method2() {		// static은 객체가 생성이 되지 않아도 실행할 수 있기 때문에 body 작성 가능
		System.out.println("static은 객체 생성 여부에 상관없이 호출할 수 있으니 상관없음");
	}
	
	
	
}


class Test4 implements Test3 {

	@Override
	public void method1() {
		System.out.println("인터페이스 Test3의 추상메서드를 구현한 메서드 1");
	}
	
}




public class Ex03 {
	public static void main(String[] args) {
//		Test3 ob = new Test3();		// Cannot instantiate the type Test3
		// 인터페이스는 추상클래스이므로,  생성자를 통한 객체 직접 생성이 불가능함.
		
		Test4 ob1 = new Test4();
		
		ob1.method1();
		
		// 인터페이스는 추상클래스이므로, 익명 내부 클래스를 활용하여 객체를 생성할 수 있음
		
		Test3 ob2 = new Test3() {
			
			@Override
			public void method1() {
				System.out.println("익명 내부 클래스");
			}
		};
		
		ob2.method1();
		
		
		
		
		
		
	}
}
