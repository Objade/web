package inheritance;

class Pos {		// 2차원의 좌표를 표현할 수 있는 객체를 만들기 위한 클래스 Pos
	
	int x;
	int y;
	
	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	void showPos() {
		
		System.out.printf("x : %d, y : %d\n", x, y);
		
	}
}


// 상속을 사용하지 않고, 3차원 좌표를 표현하기 위한 클래스를 작성한 경우
//
//class Pos3D {				
//	
//	int x;
//	int y;
//	int z;
//	
//	Pos3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//	void showPos() {
//		System.out.printf("x : %d, y : %d, z : %d\n", x, y, z);
//	}
//	
//}


class Pos3D extends Pos {
	// 1) 특성을 물려주는 클래스를 부모 클래스, 슈퍼 클래스, 상위 클래스라고 함
	// 2) 특성을 물려받는 클래스를 자식 클래스, 서브 클래스, 하위 클래스라고 함
	// 3) extends 는 '확장하다' 라는 뜻임
	//   -> 슈퍼클래스의 개념을 더욱 확장한 새로운 클래스를 말함
	// 4) 서브클래스는 슈퍼클래스의 생성자를 호출해야 객체를 생성할 수 있음
	// 5) 이때, 명시되지 않으면 슈퍼 클래스의 기본 생성자를 호출하게 됨
	// 6) 서브클래스의 생성자에서 슈퍼클래스의 생성자를 호출하려면 this 대신 super를 사용함
	// 7) 상속받은 메서드의 형식을 그대로 유지하면서 내용만 새로 작성할 수 있음 (오버라이딩)
	// 	* 형식 : 반환형, 함수 이름, 매개변수, (접근 제한자 - 기존보다 적은 범위의 제한은 걸 수 없음)
	
	// 생성자는 클래스의 이름과 똑같아야 함
	// 기본 생성자 : 매개변수가 없는 생성자
		
	
//	int x;		// Pos 클래스에서 물려받아서, 안보이지만 가지고 있음
//	int y;		// Pos 클래스에서 물려받아서, 안보이지만 가지고 있음
	
	int z;
	
	Pos3D(int x, int y, int z) {
		super(x, y);		// Pos(x, y)	
							// 생성자에서 다른 생성자를 호출할 때에는, 반드시 첫번째 줄에서만 호출할 수 있음
		
		this.z = z;

	}
	
	
//	void showPos() {			// Pos 클래스에서 물려받아서, 안보이지만 가지고 있음
//	System.out.printf("x : %d, y : %d\n", x, y);
//}
	
	@Override			// 오버라이딩 어노테이션 : 이 함수는 오버라이딩 되었습니다.
						//	-> 이걸 쓰면 아래의 클래스는 반드시 오버라이딩 되었다는 뜻임  = 반드시 물려받을 클래스의 형식을 유지해야 함
	void showPos() {	// 상속받은 메서드와 형식이 일치하고, 내용은 새로 작성되었습니다.		
		System.out.printf("x : %d, y : %d, z : %d\n", x, y, z);
	}

	
	
}



public class Ex02 {
	public static void main(String[] args) {
		
		Pos ob1 = new Pos(2, 3);
		ob1.showPos();
		
		Pos3D ob2 = new Pos3D(5, 8, 7);
		ob2.showPos();
		
		
	}

}
