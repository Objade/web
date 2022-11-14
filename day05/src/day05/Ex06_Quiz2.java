package day05;

public class Ex06_Quiz2 {
	
	// Integer.parseInt() 함수 만들어보기
	
	static int parseInt(String str) {
		
		int num = 0;
		
		for(int i = 0; i < str.length(); i++) {		// 문자열을 순서대로 반복하면서
			char ch = str.charAt(i);				// 각각의 글자를 추출하여
		 // System.out.println(ch);					// 출력으로 확인해보고
			if('0' <= ch && ch <= '9') {			// 글자가 원하는 조건을 만족하면
				num *= 10;							// 결과 변수에 더하여	-> 정수를 거꾸로 더하는 코드 같은 원리
				num += ch - 48;						// '0'의 아스키코드 48을 빼줌 
			}
		}
		System.out.println("num : " + num);			// 반복이 끝난 후 확인해보고
		return num;									// 반환한다.
	}
	
	public static void main(String[] args) {
	
		String s1 = "1234";
		int n2 = Integer.parseInt(s1) + 1;
		System.out.println(n2);
		
		int n3 = parseInt(s1) + 1;
		System.out.println(n3);
	
	}
}
