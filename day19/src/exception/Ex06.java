package exception;


class Test6 {
	
	// 현재 메서드 내부에게 발생하는 NullPointerException을 caller에게 전가시킨다.
	
	void method1() /* throws NullPointerException*/ {
		String str = null;
		
//		try {
			System.out.println(str.charAt(0));
//		} catch(NullPointerException e) {
//			System.out.println("null 값에 대한 메서드를 호출할 수 없습니다.");
//		}
		
	
		
	}
	
	void method2() throws ArrayIndexOutOfBoundsException{
		int[] arr = { 2, 7, 8, 4, 6 };
		
//		try {
			System.out.println(arr[5]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 인덱스는 길이보다 작아야 합니다.");
//		}
		
	}

}







public class Ex06 {
	public static void main(String[] args) {
		
		// throws : 현재 함수에서 발생한 에외의 처리를 caller에게 전가시킴
		
		Test6 ob = new Test6();
		
//		try {
//			ob.method1();
//			ob.method2();
//		} catch(Exception e) {
//			System.out.println("무언가 알 수 없는 예외가 발생했습니다.");
//		}
		
		
		try {
			ob.method1();

		} catch(NullPointerException e) {	// throws NullPointerException (런타임 예외라서 처리 안해도 실행 가능)
			System.out.println("NullPointerException");
		} 
		
		
		try {
			Thread.sleep(1000);		// throws InterruptedException (런타임 예외가 아니라서 의무적으로 처리)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		try {
			ob.method2();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		
		
	}
}
