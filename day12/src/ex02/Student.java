package ex02;

public class Student {
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	Student[] arr = new Student[5];
	
	// 생성자는 name, kor, eng, mat만 받음
	// 합계와 평균은 자동으로 계산하도록 함
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
	}
	
	// 모든 Student의 객체는 반드시 이름과 국영수를 포함해야 함
	// 값을 전달하지 않고서는 절대로 객체를 생성할 수 없음
	
	
	// public String toString()을 사용하면 객체를 바로 출력해도 알아서 문자열 형태로 변환됨
	
	public String toString() {
		String result = String.format("이름 : %s (국어 : %d, 영어 : %d, 수학 : %d)\n합계 : %d, 평균 : %.2f", 
									  name, kor, eng, mat, sum, avg);
		
		return result;
	}
	
}
