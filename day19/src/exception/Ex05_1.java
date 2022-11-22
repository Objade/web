package exception;

import java.util.Scanner;

class MyOperatorException extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {	// override from Object
		return super.toString();
	}

	@Override
	public String getMessage() {	// override from Throwable
		return "연산자에는 +, -, *, / 만 입력할 수 있습니다";
	}
}

public class Ex05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		char oper;
		
		try {
			System.out.print("n1 : "); 	n1 = Integer.parseInt(sc.nextLine());
			System.out.print("연산 : "); 	oper = sc.nextLine().charAt(0);
			System.out.print("n2 : "); 	n2 = Integer.parseInt(sc.nextLine());
			
			switch(oper) {
				case '+':	result = n1 + n2; break;
				case '-':	result = n1 - n2; break;
				case '*':	result = n1 * n2; break;
				case '/':	result = n1 / n2; break;
				default:  	
					MyOperatorException ex = new MyOperatorException();
					throw ex;
			}
			System.out.println("결과 : " + result);
			
		} catch(NumberFormatException e) {	// 문자열을 숫자로 변환할 때 발생할 수 있는 예외
			System.out.println("정수를 입력해야 합니다");
			
		} catch(ArithmeticException e) {	// 정수를 0으로 나눌때 발생할 수 있는 예외
			System.out.println("정수를 0으로 나눌 수 없습니다");
			
		} catch(MyOperatorException e) {	// 연산자에 지정된 문자 이외 값을 입력할 경우 발생시키는 예외
			e.printStackTrace();
			
		} catch(Exception e) {		// 모든 예외를 받아서
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();	// 예외 발생 현황을 추적하면서 출력한다 (기본값)
			
		} finally {
			sc.close();
		}
		System.out.println("종료");
	}
}
