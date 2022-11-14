package day03;

import java.util.Random;
import java.util.Scanner;

public class Ex07_Quiz1 {
	public static void main(String[] args) {
		
		/*
		 * 1층에서 15층 사이의 엘리베이터가 3개 있습니다.
		 * 사용자에게 현재 층을 입력 받아서, 가장 가까운 엘리베이터가 이동할 수 있도록
		 * 출력문을 만들어서 출력해주세요.
		 * 
		 */
		
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		
		int current;
		
		int distance1, distance2, distance3;
		
		int min;
		
		System.out.printf("엘리베이터 1 층수 : %d층\n", n1);
		System.out.printf("엘리베이터 2 층수 : %d층\n", n2);
		System.out.printf("엘리베이터 3 층수 : %d층\n", n3);
		
		System.out.print("현재 층 입력 : ");
		current = sc.nextInt();
			
		while(current <= 0 || current > 15) {
			System.out.println("1 ~ 15 사이의 숫자를 입력하세요");
			System.out.print("현재 층 입력 : ");
			current = sc.nextInt();
		}
		
		// 거리 측정
		distance1 = current - n1;
		distance2 = current - n2;
		distance3 = current - n3;
		
		// 크기 비교를 위해 절대값 구하기
		if(distance1 < 0) distance1 *= -1;
		if(distance2 < 0) distance2 *= -1;
		if(distance3 < 0) distance3 *= -1;

		
		// 가장 가까운 층 구하기
		min = distance1;
		if(min >= distance2) min = distance2;
		if(min >= distance3) min = distance3;
		
		// 출력
		if (min == distance1) System.out.println("가장 가까운 층수 : " + n1 + "층");
		if (min == distance2) System.out.println("가장 가까운 층수 : " + n2 + "층");
		if (min == distance3) System.out.println("가장 가까운 층수 : " + n3 + "층");
		
		System.out.println();
		
		// 풀이
		// 가장 가까운 엘리베이터
		// 절대값(현재층 - 대상층) 중에서 최소값을 가지는 엘리베이터
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		System.out.print("현재 층수 : ");
		current = sc.nextInt();			// 현재 층수를 입력받는다.
			
		int d1 = current - n1;			// 현재 층과 각 엘리베이터 층수의 '차이'를 구한다.
		int d2 = current - n2;
		int d3 = current - n3;
		
		d1 = d1 < 0 ? -d1 : d1;			// 위 혹은 아래 방향에 상관없이 '거리'를 구하기 위해 '절대값' 처리한다.
		d2 = d2 < 0 ? -d2 : d2;
		d3 = d3 < 0 ? -d3 : d3;
		
		int minn = d1;					// '거리 중에서 최소값'을 찾아낸다.
		
		if(minn > d2) minn = d2;			
		if(minn > d3) minn = d3;
		
		
		// 최소값과 일치하는 요소가 이동하는 형식을 출력한다.
		
		if(minn == d1) System.out.println("첫번째 엘리베이터가 움직입니다.");
		if(minn == d2) System.out.println("두번째 엘리베이터가 움직입니다.");
		if(minn == d3) System.out.println("세번째 엘리베이터가 움직입니다.");
		
		
		sc.close();
	}

}
