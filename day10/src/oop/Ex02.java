package oop;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// oop.Number 클래스 (Ex01)를 사용하여 객체의 배열 생성
		
		Number[] arr = new Number[12];	// 참조 변수를 12개 만듦 
										// 변수 : 데이터를 담는 공간일 뿐, 객체가 아님
										// 생성된 객체는 0개
		
		// 배열(Number를 저장할 수 있는 참조변수 12개)만 생성했을 뿐,
		// Number타입의 객체(실체)는 아직 없음
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} // 모든 칸이 비어있음 (null)
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Number(i + 1);
		} // 각 칸에 i + 1값으로 객체를 생성함
		  // 객체의 수 : 12개
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} // 모든 칸이 비어있지 않음
		
		System.out.println();
		
		
		Random ran = new Random();
		int n = ran.nextInt(12);	// 정수를 랜덤으로 지정하여 
		Number cpu = arr[n];		// 컴퓨터가 n번째 카드를 뽑게한다.
		
		int m = ran.nextInt(12);
		Number you = arr[m];
		
		System.out.printf("cpu : %s, you : %s\n", cpu, you);
		System.out.println(cpu.num > you.num ? "패배" : "승리");
		
		
		// 객체의 수 : 12개 
	
		
	}
}
