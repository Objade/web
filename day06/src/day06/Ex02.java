package day06;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 (array) : 같은 자료형의 여러 데이터를 묶어서 관리하는 자료구조
		// 배열은 여러 값을 구별하기 위해 index라고 하는 정수 값을 이용함
		
		// 배열의 각 멤버 요소는 단일 변수와 동일함
		
		int[] arr = { 2, 7, 8, 4, 6 };
		
		// arr배열의 0번째 요소(변수)의 값은 2이다
		// arr배열의 0번째 요소(변수)의 값은 7이다
		// arr배열의 0번째 요소(변수)의 값은 8이다
		// arr배열의 0번째 요소(변수)의 값은 4이다
		// arr배열의 0번째 요소(변수)의 값은 6이다
		
		// 배열 안에 5개의 정수가 포함되어 있어서, 배열의 길이는 5이다
		// - 배열의 길이는 바뀌지 않음
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// System.out.println(arr[5]);
		// -> 배열의 인덱스에 배열의 범위를 넘어가는 수를 입력하면,
	   //     실행시 범위 초과 에러가 남
		
		
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열의 요소를 반복문으로 출력해보기
		
		for(int i = 0; i < arr.length; i++) {	// 배열 및 리스트를 대상으로,
												// 항상 0부터 크기까지
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// 배열의 멤버요소는 일반 변수와 동일하게 취급함
		
		// 대입
		arr[0] = 3;
		
		// 연산
		arr[1] += 1;
		
		// 출력
		System.out.println(arr[2]);
		
		
		
		
	}
}
