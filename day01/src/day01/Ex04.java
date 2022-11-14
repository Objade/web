package day01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리 연산에 의한 연산 미수행
		
		int n1 = -1, n2 = 0, n3 = 1, n4 = 2;
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		boolean flag1 = n1++ + ++n2 < 0 && n3-- * n4 == 0;
		
		// 첫번째 조건 (n1++ + ++n2 < 0) 이 이미 false. (조건을 만족함)
		// -> 두번째 연산까지 가지 않음.
		// -> 두번째 조건의 식은 아예 수행되지 않음
		
		// 두가지 조건 중 하나라도 만족하면 참.
		// -> 첫번째 조건이 이미 참이라면 따라오는 두번째 조건은 굳이 실행하지 않음.
	
		
		// => 두 조건 중 첫번째 조건 만으로 전체 결과가 확정된다면, 두번째 조건은 연산을 수행하지 않는다.
		
		
		
		System.out.println(flag1);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		
		
		
	}
}
