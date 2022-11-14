package sort;

public class Ex09 {
	public static void main(String[] args) {

		// 문자열 배열의 정렬

		String[] arr = { "이지은", "홍진호", "강호동", "이병건", "주호민" };
		
		showArray(arr);
		// 1) 문자열은 문자의 배열과 같음
		// 2) 문자(char)는 정수형임. (글자의 코드를 정수로 저장함) ~ ASCII 코드
		// 3) 문자열을 구성하는 첫번째 글자를 비교하여 정렬함
		// 4) 만약, 첫번째 글자가 같으면 그 다음 글자끼리 비교함
		
		System.out.println("이지은".compareTo("홍진호"));
		System.out.println("이지은".compareTo("강호동"));
		
		// 5) 정수 두개의 값을 비교함				n1 > n2		-> 비교 대상이 정수인 경우
		// 6) 두 정수의 차가 0보다 크냐 작냐를 판별함		n1 - n2 > 0	-> 주로 비교 대상이 정수가 아닌 경우
		// 7) s1.compareTo(s2) 는 두 문자열의 차이를 정수로 반환함 ~ 유니코드
		
		// 문자열의 크기 비교
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length; j++) {
				// if(arr[i] > arr[j])
				if(arr[i].compareTo(arr[j]) > 0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
				
			}
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// 44033 - 44032 = 1 	~> 유니코드
		System.out.println("각".compareTo("가"));
		
			
		

	}

	static void showArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
