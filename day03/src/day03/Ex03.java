package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 0 ~ 30 사이의 정수를 입력받아서, 입력받은 위치에 ↑ 가 위치하도록 코드를 작성하세요.
		// 반복할 것 : 띄어쓰기 문자열
		
		Scanner sc = new Scanner(System.in);
		
		String bar1 = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		String bar2 = "│    │    │    │    │    │    │\n";
		
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		while(num < 0 || num > 30) {
			System.out.println("0 ~ 30까지의 정수를 입력하세요.");
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		
		
		System.out.print(bar1 + bar2);
		
		for(int i = 0; i < num; i++) {
			System.out.print(" ");
		}
		
		System.out.println("↑");
		
		sc.close();
		
		
	}
}
