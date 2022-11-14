package day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// if 복습 문제
		
		// 1) 세 정수를 입력 받은 뒤, 최소값을 찾아서 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.print("정수 3 입력 : ");
		int n3 = sc.nextInt();
		
		int min = n1;
		
		if(min >= n2)  {
			min = n2;
		}
		if(min >= n3) {
			min = n3;
		}
		
		System.out.printf("입력 받은 수 : %d, %d, %d\n", n1, n2, n3);
		System.out.println("최소값 : " + min);
		
		System.out.println();
		
		// 풀이
		// 세 정수를 한번에 출력할 수도 있음
//		System.out.println("세 정수 입력 : ");
//		n1 = sc.nextInt();
//		n2 = sc.nextInt();
//		n3 = sc.nextInt();
		
	
		
		// 2) 정수를 입력 받아서, 정수의 절대값을 출력하는 코드를 작성하세요.
		
		System.out.print("절대값을 출력할 정수 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0) {
			num = num * -1;
		}
		
		System.out.println("절대값 : " + num);
		
		// 다른 풀이 (삼항 연산자) 
		
		System.out.printf("절대값 : %d", num < 0 ? -num : num);
		System.out.println();
		
		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요.
		
		System.out.print("정수 입력 : ");
		int nn = sc.nextInt();
		
		if(nn % 2 == 0) {
			System.out.println(nn + "은 짝수입니다.");
		}
		else {
			System.out.println(nn + "은 홀수입니다.");
		}
		
		// 다른 풀이 (삼항 연산자)
		System.out.printf("%d은 %s입니다.\n", nn, nn % 2 == 0 ? "짝수" : "홀수");
		
		sc.close();
		
	}
}
