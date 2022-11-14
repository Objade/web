package oop;

class Number {		// 클래스는 1개
	int num;
	
	Number(int num) {
		this.num = num;
	}
	
	public String toString() {
		return num + "";
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		// 클래스는 자료형이고, 객체는 클래스에 의해 만들어진 데이터임
		// 하나의 클래스로 여러개의 서로 다른 객체를 생성할 수 있음
		
		Number n1 = new Number(3);
		Number n2 = new Number(5);
		Number n3 = n1;				// 객체는 2개
									// 참조변수는 3개
									// n1과 n3는 같은 수를 참조하고 있음
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		
		
		
		
	}
}
