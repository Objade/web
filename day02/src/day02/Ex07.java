package day02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// if 문제
		/*
		 *  이용시간에 따라 요금을 책정하는 놀이기구가 있다.
		 * 기본요금 3천원으로 시작하여, 10분당 추가요금 500원이 발생한다
		 * 요금표는 아래와 같은 규칙으로 적용한다
		 * 
		 * 0 ~ 30분	-> 3000원
		 * 31 ~ 40분  -> 3500원
		 * 41 ~ 50분  -> 4000원
		 * ...
		 * 
		 * 이용시간을 분으로 입력받아서, 금액을 계산하여 출력하는 코드를 작성하세요
		 * 
		 * */ 
		
		
		
		int price = 3000; 
		int add_price = 0;
		int time;
		int add_time;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이용 시간(분) 입력 : ");
		time = sc.nextInt();
		
		if(time < 30) {
			add_price = 0;
		}
		else{
			add_time = time - 30;
			
			if(add_time % 10 > 0) {
				add_time += 10;
			}
		
			add_price += (add_time / 10) * 500;
			
		}
		
		System.out.printf("요금 : %d원", (price + add_price));
		
		
		
		
		System.out.println();
		
		// 풀이
		
		int time1, fee = 3000, overcost;
		
		System.out.print("시간 입력 (분) : ");
		time1 = sc.nextInt();
		
		if(time1 > 30) {
			if(time % 10 != 0) {
				overcost = (((time - 30) / 10) + 1) * 500;
			}
			else {
				overcost = ((time - 30) / 10) * 500;
			}
			fee += overcost;
		}
		
		System.out.println("요금 : " + fee);
		
		
		
		// 풀이 2
		
		System.out.println("요금 : " + getFee(time));
		
		
		
		sc.close();
	}
	
	
	// 풀이 2
	// This method must return a result of type int
	
	static int getFee(int time) {
		
		int fee, overcost;
		
		if(time > 30) {
			if(time % 10 != 0) {
				overcost = (((time - 30) / 10) + 1) * 500;
			}
			else {
				overcost = ((time - 30) / 10) * 500;
			}
			fee = 3000 + overcost;
			return fee;
		}
		
	return 3000;
	
	
	
	}
}
