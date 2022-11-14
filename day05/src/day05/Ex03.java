package day05;

public class Ex03 {
	public static void main(String[] args) {
		
		// 문자열 관련 함수
		
		String s1 = "root:x:0:0:root:/root:/bin/bash";
		String[] arr = s1.split(":");	// 구분자 (Separator) : 문자열을 구분할 때 기준이 되는 기호
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		String s2 = "https://search.naver.com/search.naver?query=아이유&where=image";	
		// ? 기준 왼쪽 - 주소 이름, 오른쪽 - 사용자가 입력한 값
		
		String[] a1 = s2.split("\\?");	// ? 는 별도의 기능이 있어서 제거함
		String[] a2 = a1[1].split("&");	// & 기준 왼쪽 : 검색 내용, 오른쪽 : 탭 선택
		
		for(int i = 0; i < a2.length; i++) {
			String[] a3 = a2[i].split("=");
			System.out.printf("%s : %s\n", a3[0], a3[1]);
		}
		
		System.out.println();
		
		
		// substring : 문자열 빼기 (-)
		
		// a.substring(int beginIndex, int endIndex) 
		String s3 = s2.substring(8, 24);
		System.out.println(s3); // s2의 [8] 부터 [24] 까지 출력 -> 도메인 이름만 가져올 수 있음
		
		int beginIndex = s2.indexOf("search");		// indexOf() : 입력한 문자열을 왼쪽부터 찾음
		int endIndex = s2.lastIndexOf("search") - 1;	// lastIndexOf : 입력한 문자열을 오른쪽부터 찾음
		
		System.out.printf("%d ~ %d\n", beginIndex, endIndex);
		
		String s4 = s2.substring(beginIndex, endIndex);
		System.out.println(s4);
		
		
		// 문자열의 일치 비교
		String t1 = "apple";	// 리터럴 상수 : 프로그램이 실행되기 전, 메인함수의 정상적인 실행을 위해 프로그램 상에서 미리 준비해 놓은 데이터
		String t2 = new String("apple");	// Scanner로 입력받은 문자열도 똑같음
		String t3 = "apple";
		
		System.out.printf("%s, %s, %s\n", t1, t2, t3);
		
		// 바라보는 대상이 같은가
		System.out.println("t1 == t2 : " + t1 == t2);
		System.out.println("t1 == t3 : " + t1 == t3);
		
		// false가 나오는 이유 -> 서로 바라보는 대상이 다르기 때문
		// 자바의 비교 연산자 : 서로 바라보는 대상이 같은 가를 비교함 (내용을 비교하는 것이 아님)
		
		
		// 각 대상의 내용이 똑같은가
		System.out.println("t1.equals(t2) : " + t1.equals(t2));
		System.out.println("t1.equals(t3) : " + t1.equals(t3));
		
		// equals() : 문자열의 내용을 비교해줌
		// - 자료형이 대문자로 시작하는 경우에는 equals로 비교해야 함.
		// -> '문자열'을 비교하기 위해서는 반드시 'equals'로 비교해야 함.
		
		
		
	
		
	}
}
