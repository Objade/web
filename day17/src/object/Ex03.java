package object;

class MyNumber extends Object {
	
	int num;
	
	public MyNumber(int num) {
		this.num = num;
	}
	
	
	@Override
	public String toString() {		// 객체를 문자열 형태로 변환해서 반환해줌
		return String.valueOf(num);		// 객체없이 클래스에서 바로 호출 -> static 메서드
	}
	
	@Override
	public boolean equals(Object obj) {		// 서로다른 두개의 객체가 일치하는지를 비교하여 반환해줌
		// this와 obj를 비교하여, 일치하면 true를 반환하고, 아니면 false를 반환한다.
		
		if(obj instanceof MyNumber) {			// 비교대상 obj의 클래스가 같으면 비교함
			return this.num == ((MyNumber)obj).num;
		}
		
		return false;	// 클래스가 다르면 비교할 필요없이 false를 반환
	}
	
}


public class Ex03 {
	public static void main(String[] args) {
		
		MyNumber n1 = new MyNumber(10);		// new 연산자를 사용했다면, 새로운 공간에 객체를 생성함
		MyNumber n2 = new MyNumber(10);	
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n1 == n2 : " + (n1 == n2));		// 두 변수가 같은 대상을 바라보는가?
		System.out.println("n1.equals(n2) : " + n1.equals(n2)); // 두 변수의 내용이 같은가?
		
		
		
		
	}
}
