package day01;

import java.util.Scanner;

public class Ex07_Quiz2 {
	public static void main(String[] args) {
		
		// 버스 한 정거장을 이동하는데 약 3분의 시간이 소요된다고 가정한다.
		// 사용자에게 이동한 정거장 수를 입력받아서 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면 시간과 분을 나누어서 출력하세요
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정거장 수를 입력하세요. : ");
		int count = sc.nextInt();
		
		int time = count * 3;
		int hour = time / 60;
		int min = time % 60;
		
		if(time > 60) {
			System.out.printf("소요시간 : %d시간 %d분", hour, min);
		}else {
			System.out.println("소요시간 : " + time + "분");
		}
		
		
		// 풀이
		
		System.out.println();
		
		// 0. 문제에서 나타나는 변수를 미리 선언해둔다
		
		int station, hour1, minute;
		
		// 1. 요인이 되는 값(정거장 수)을 입력받는다.
		
		System.out.print("정거장 수 입력 : ");
		station = sc.nextInt();
		
		
		// 2. 정거장 수에 3을 곱하여 분을 계산한다.
		
		minute = station * 3;
		
		
		// 3-1. 만약, 분이 60보다 크다면 나눗셈으로 시간과 분을 분리한다.
		
		if(minute > 60) {
			hour1 = minute / 60;	// 시간 (몫)
			minute = minute % 60;	// 분   (나머지)	-> minute /= 60;
			System.out.printf("%d시간 %d분\n", hour1, minute);
			
		}
		
		// 3-2. 아니라면, 분을 그대로 출력한다
		
		else {
			System.out.println(minute + "분");
		}
		
		// 4. 코드 마무리 - sc.close();
		
		sc.close();
		
	}
}
