package day02;

public class Ex09 {
	public static void main(String[] args) {
		
		// 1) while을 이용하여 정수를 거꾸로 뒤집어서 다른 변수에 저장한 후 출력하세요.
		
		int n1 = 1234;
		int n2 = 0;
			
		
		while(n1 > 0) {
			
			n2 *= 10;
			n2 += n1 % 10;
			n1 /= 10;
		}
		
		System.out.println("n2 : " + n2);	// 4321
		
		
		// 풀이
		
		n1 = 1234;
		n2 = 0;
		
//		System.out.println(n1 % 10);		// 우선 n1의 4를 뽑아내본다.
//		n2 += n1 % 10;
//		n2 = n1 / 10;
//		n1 /= 10;	// n1 = n1/10;
//		n2 = n2 * 10;	// 3번째로 추가한 코드
//		System.out.println(n1 + ", " + n2);
		
		// 결과 1
		while(true) {
			n2 = n2 * 10;
			n2 += n1 % 10;
			// n1 = n1 / 10;
			n1 /= 10;
			
			if(n1 == 0) {
				break;
			}
			
		}
		System.out.println(n1 + ", " + n2);
		
		// 결과 2
		n1 = 1234;
		n2 = 0;
		
		while(n1 != 0) {
			n2 = n2 * 10;
			n2 += n1 % 10;
			// n1 = n1 / 10;
			n1 /= 10;

			
		}
		System.out.println(n1 + ", " + n2);
		
		
		
		
		
		// 2) for를 이용하여 1부터 1000사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하세요.
		
		int oddSum = 0, evenSum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;	
			}
		}
		
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);
		
		
		
		// 풀이 
		oddSum = 0;
		evenSum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			boolean isOdd = i % 2 == 1;
//			System.out.println(i + " : " + isOdd);	// -> 홀수/짝수 확인
			
			if (isOdd) {
				oddSum += i;
			}
			else {
				evenSum += i;	
			}
		}
		
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);
		
		
		// 방법 2 -> 부등호 처리가 익숙하지 않다면 이렇게 해도 됨 (파이썬의 for i in range(1000, 1) 과 비슷한 구조)
		
		oddSum = 0;
		evenSum = 0;
		
		for(int i = 1; i != 1001; i++) {
			boolean isOdd = i % 2 == 1;
			
			if (isOdd) {
				oddSum += i;
			}
			else {
				evenSum += i;	
			}
		}
	
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);	// 250000, 250500
		
		
		
		
		
		
		
		
		
		
	}
}

