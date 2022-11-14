package day04;

public class Ex02 {
	
	// y = f(x)
	
	// 문제 1
	static int getMaxNum(int a, int b, int c) {
		int max = a;
		
		if(max < b) max = b;
		if(max < c) max = c;
		
		return max;
		
	}
	
	// 문제 2
	static int getReverseNumber(int n1) {
		int n2 = 0;
		
		while(n1 != 0) {
			n2 *= 10;
			n2 += n1 % 10;
			n1 /= 10; 
			
		}
		
		return n2;
	}
	
	// 문제 2 풀이)
	static int ReverseNumber(int num) {
		int ret = 0;
		while(true) {
			ret += num % 10;
			ret *=10;
			num /= 10;
			if(num < 10) {
				return ret + num;
				// 반복문 안에서 return을 수행하면, 반복문과 상관없이 함수가 즉시 종료됨
			}
		}
	}
	
	// 문제 3
	static int getFee(int time) {
		
		int fee = 3000;
		int overfee;
		int add_time = time - 30;
		
		if(time > 30) {
			
			if(add_time % 10 > 0) {
				add_time += 10;
			}
			
			overfee = (add_time / 10) * 500;
			
			return fee + overfee;
		}
		
		else {
			return fee;
		}
	
	}
	
	// 문제 3 풀이1)
	
	static int price(int time) {
		int fee = 3000;
		if(time > 30) {
			fee += (((time - 21) / 10) * 500);
		} return fee;
	}
	
	// 문제 3 풀이2)
	static int getPrice(int time) {

		int over = ((time - 21) / 10) * 500;
		return time > 30 ? 3000 + over : 3000;
		
		// 삼항 연산은 값을 결정하고,return은 값을 반환하기 때문에,
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있음
		
	}
	
	// 문제 4
	static int getSummary(int n1, int n2)  {
		int sum = 0;
		for(int i = n1; i <= n2; i++) {
			sum += i;
			
		}
		
		return sum;
	}
	
	// 문제 4 풀이 )
	
	static int Summary(int a, int b)  {
		return (a + b) * (b - a + 1) / 2;	// 등차수열 사용
		
		// 알고리즘 : 똑같은 문제를 보다 효율적(시간적(연산시간), 공간적(메모리))으로 접근하는 방식
	}
	
	
	public static void main(String[] args) {
		
		// 문제 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요.
		int n1 = getMaxNum(2, 5, 3);
		System.out.println("n1 : " + n1);
		
		// 문제 2) 정수를 전달 받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요. -> while
		
		int n2 = getReverseNumber(1234);	
		System.out.println("n2 : " + n2);
		
		int nn2 = ReverseNumber(1234);	
		System.out.println("nn2 : " + nn2);
		
		// 문제 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요. -> if
		
		int n3 = getFee(40);	
		System.out.println("n3 : " + n3);
		
		int nn3 = price(40);	
		System.out.println("nn3 : " + nn3);
		
		int nnn3 = getPrice(40);	
		System.out.println("nnn3 : " + nnn3);
		
		// 문제 4) 두 정수 a, b를 전달 받아서, a와 b 사이의 모든 합계를 반환하는 함수를 작성하세요. -> for
		int n4 = getSummary(1, 100);
		System.out.println("n4 : " + n4);
		
		int nn4 = Summary(1, 100);
		System.out.println("nn4 : " + nn4);
		
	}
}
