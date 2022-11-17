package inheritance;

class Super {
	int n1;
	Super() {
		System.out.println("Super 생성자 호출");
	}
}

class Sub extends Super {
	int n2;
	Sub() {
		super();	// 반드시 첫번째 줄에서만 가능
					// -> 서브클래스에서 슈퍼 클래스의 생성자를 직접 호출함

		System.out.println("Sub 생성자 호출");
	}
	
	
}



class Super1 {				
	int n1;					// 4바이트
	Super1(int n1) {
		this.n1 = n1;
		System.out.println("Super 생성자 호출");
	}
}

class Sub1 extends Super1 {			// Sub1 : Super의 4바이트 + Sub1의 4바이트 = 8바이트
	int n2;					// 4바이트
	Sub1(int n1, int n2) {
		super(n1);	
		this.n2 = n2;
		System.out.println("Sub 생성자 호출");
	}
	
	
}


public class Ex03 {
	public static void main(String[] args) {
		Sub ob = new Sub();		
		
		System.out.println(ob.n1);
		
		
		Sub1 ob2 = new Sub1(10, 20);
		System.out.printf("n1 : %d, n2 : %d\n", ob2.n1, ob2.n2);
		
	}
}
