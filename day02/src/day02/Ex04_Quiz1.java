package day02;

import java.util.Scanner;

public class Ex04_Quiz1 {
	public static void main(String[] args) {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요.
		// 단, 주소는 띄어쓰기를 포함하여 입력할 수 있어야 합니다.
		
		// 입출력에는 사용자의 입력에 따라 예외가 발생할 수 있기 때문에 보통 IOException 처리를 해야하지만,
		// Scanner는 내부 코드에서 예외 처리가 되어있어서, 예외 선언을 안해도 됨
		
		// 1) 변수 선언
			String name, address;
			int age;
			
		// 2) 입력
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 입력 : ");
			name = sc.next();
			
			System.out.print("나이 입력 : ");
			age = sc.nextInt();
			
			sc.nextLine();	// 버퍼 정리
							// 버퍼 정리를 하지 않으면 이전에 입력했던 엔터의 영향으로 주소 입력에 빈 문자열이 들어가버림
		
			
			System.out.print("주소 입력 : ");
			address = sc.nextLine();
					
			
			
		// 방법 2

			System.out.print("이름 입력 : ");
			name = sc.nextLine();
			
			System.out.print("나이 입력 : ");
			age = Integer.parseInt(sc.nextLine());
			
			System.out.print("주소 입력 : ");
			address = sc.nextLine();
					
			
		
		// 3) 출력
		
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("주소 : " + address);
			
		// 4) 마무리
		
			sc.close();
		
		
			
			
		// JSP 에서는 이렇게 씀
		// String name = request.getParameter("name");
		// String age = request.getParameter("age");
		// int _age = Integer.parseInt(age);
			
		// -> 오류 발생을 줄이기 위해, 가급적이면 모든 입력은 일단 문자열의 형태로 받자.
		// -> 이후에 형변환 과정을 거칠 수 있음.
		
		
			

		
		
	}
}
