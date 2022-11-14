package oop;

class Test2 {

	int num;
	
	// 기본 생성자
	Test2()	{
		this(0);		// 생성자 안에서 또다른 생성자를 호출하는 것이 가능함 
						// 객체가 하나 더 늘어난건 아님
					
		System.out.println("기본 생성자 호출!");
		// this(0);
		// Constructor call must be the first statement in a constructor
		// -> 생성자의 호출은 반드시 생성자의 첫번째 줄에서만 가능
		//    1) 객체의 생성 (생성이 완료되지 않으면, 추가작업을 진행할 수 없음)
		//    2) 객체의 생성 이후 초기값 할당 및 추가 작업 진행
	}
	
	Test2(int num) {
		this.num = num;
		System.out.println("int를 전달받는 생성자 호출!");
	}
}


public class Ex05 {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(12);
		
		
		
		
		
	}
}
