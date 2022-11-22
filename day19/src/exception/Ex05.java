package exception;

import java.util.Scanner;

class MyExcept extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {	// Override from Object
		
		return "연산자가 아닌 다른 값을 입력받았습니다.";
	}
	
	@Override
	public String getMessage() {	// Override from Throwable
		
		return "연산자가 아닌 다른 값을 입력받았습니다.";
	}
	
	
}

public class Ex05 {
	
	static boolean notOperation(char oper) {
		if(oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%') {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		// 두 정수와 연산자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요.
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 try ~ catch 구문으로 작성하세요.
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다.
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다.
				
		
		Scanner sc = new Scanner(System.in);
		int n1;	
		int n2;	
		char oper;
		double result = 0;
		

		try {
			System.out.print("정수1 입력 : ");
			n1 = Integer.parseInt(sc.nextLine());
			
			System.out.print("정수 2 입력 : ");
			n2 = Integer.parseInt(sc.nextLine());
			
			System.out.print("연산자 입력 : ");
			oper = sc.nextLine().charAt(0);
		
			if(notOperation(oper) == false) {
				try {	
					MyExcept ex = new MyExcept();
					throw ex;
					
				} catch(MyExcept e) {	// 연산자에 지정된 문자 이외 값을 입력할 경우 발생시키는 예외
					System.err.println("연산자가 아닌 값을 입력했습니다.");
					
				} 

			}
			
			else {
				if(oper == '+') result = n1 + n2;
				else if(oper == '-') result = n1 - n2;	
				else if(oper == '*') result = n1 * n2;
				else if(oper == '/') result = n1 / n2;
				else if(oper == '%') result = n1 % n2;

				System.out.printf("%d %c %d = %.2f", n1, oper, n2, result);
			}
			

		} catch(NumberFormatException e){		// 문자열을 숫자로 변환할 때 발생할 수 있는 예외
			System.err.println("int형 정수가 아닌 값을 입력했습니다.");
			
		} catch(ArithmeticException e) {		// 정수를 0으로 나눌때 발생할 수 있는 예외
			System.err.println("0으로는 나눌 수 없습니다.");
			
		} catch(Exception e) {		// 모든 예외를 받아서
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();		// 예외 발생 현황을 추적하면서 출력함 (기본값)
										// 가급적이면 마지막에 사용할 것
		}  finally {
			sc.close();
		}

		
		System.out.println("종료");
		
		
		
	}

}
