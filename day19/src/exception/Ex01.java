package exception;

import java.util.Scanner;

public class Ex01 {
	
	// 문자열이 숫자로만 구성되어 있는가를 판별하는 함수
	
	static boolean isNumeric(String data) {			// 문자열을 전달받아서
		for(int i = 0; i < data.length(); i++) {	// 글자마다 반복하여
			char ch = data.charAt(i);				// i번째 글자가
			if(ch < '0' || '9' < ch) {				// 0 ~ 9 사이를 벗어난다면
				return false;						// false
			}
		}
		return true;		// 벗어나는 글자가 없다면 true
	}
	
	
	
	public static void main(String[] args) {
		// Exception : 프로그램에서 발생할 수 있는 예외 상황을 객체로 취급하는 클래스
		// java.lang.Exception
		
		// 예외 : 예측 할 수 있는 문제상황, 적절한 처리를 통해 처리할 수 있음
		
		// 에러 : 코드 상의 결함으로 발생하는 프로그램 내부에서 처리할 수 없는 문제상황
		//		-> 코드의 방향이 잘못되었기 때문에 코드 자체를 수정해야함
		
		Scanner sc = new Scanner(System.in);
		int n1;
//		
//		System.out.print("정수 입력 : ");
//		n1 = sc.nextInt();
//		
//		System.out.println("n1 : " + n1);
//		sc.close();
		
		
		
		// 코드 실행 중, 만약 사용자가 정수가 아닌 값을 입력하면 예외가 발생함
		// Exception in thread "main" java.util.InputMismatchException
		
		// 예외 처리 
		
		String input;
		
		System.out.print("정수 입력 : ");
		// n1 = sc.next();
		
		input = sc.next();
		
		if(isNumeric(input)) {					// if가 본래 목적과 다르게 사용됨
			n1 = Integer.parseInt(input);
			System.out.println("n1 : " + n1);
		}
		
		else {
			System.err.println("정수를 입력하지 않았습니다 !");
		}
		
		sc.close();
		
		
		
//		int[] arr = new int[5];
//		arr[5] = 30;
//		System.out.println(arr[5]);
		
		// 배열의 범위보다 높은 값을 넣으면 예외가 발생함
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		
		
		// Exception : 모든 예외의 최상위 클래스
		
		
		
	}
}
