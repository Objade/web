package _class;

class Score {	// 객체를 만들기 위한 설계도의 역할을 수행하는 클래스
	int kor, eng, mat;	// 객체의 세부 [속성값] 을 저장할 변수(멤버필드)
	
	void show() {		// 객체의 [기능] 을 표현하는 함수 (멤버 메서드)
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);	
		System.out.println("수학 점수 : " + mat);
	}
}

/*
 * 클래스의 구성요소
 * 
 * - 필드 : 객체의 속성을 표현하기 위한 변수, 메서드에서는 필드에 접근할 수 있음
 * - 메서드 : 객체의 기능을 표현하기 위한 함수, 메서드 내부에서 별도의 지역변수를 선언할 수도 있음
 * - 생성자 : 객체를 생성할 때 호출되는 특수한 함수, 오버로딩이 가능함. 클래스의 이름과 동일한 함수여야 함
 * - 접근 제한자 : 객체 내부 요소를 보호하기 위한 형식. 외부로부터의 접근가능 여부를 지정함
 * 
 * 
 * 
 */

public class Ex04 {
	public static void main(String[] args) {
		// 1) 세 과목의 점수를 배열로 처리함
		int[] arr = {100, 99, 87};
		System.out.println("국어 점수 : " + arr[0]);	// 0은 국어 점수이고
		System.out.println("영어 점수 : " + arr[1]);	// 1은 영어 점수이고
		System.out.println("수학 점수 : " + arr[2]);	// 2는 수학 점수이다 (라고 기억해야 함)
		System.out.println();
		
		// 2) 세 과목의 점수를 클래스에 의한 객체로 처리함
		
		Score ob = new Score();
		ob.kor = 100;
		ob.eng = 99;
		ob.mat = 87;
		
//		System.out.println("국어 점수 : " + ob.kor);
//		System.out.println("영어 점수 : " + ob.eng);	
//		System.out.println("수학 점수 : " + ob.mat);
		
		ob.show();
		
		// 객체 : 속성과 기능으로 나눔
		// 속성 : 속성값, 변수에 저장함.
		// 기능 : 함수로 정의함. 동작과 관련된 것. 반환값이 있음.
		// -> 두개를 합쳐서 클래스라고 함
		
		// 클래스를 만드는 이유 : 데이터를 좀 더 효율적으로 관리하기 위함
		//				-> 사물, 혹은 객체를 사용자가 인지하는 그대로 표현할 수 있음
		
		
	}

}
