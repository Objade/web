package airplane;

public class Main {
	public static void main(String[] args) {
		
		Airplane air = new Airplane();

		
		
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다. (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다.
		// 이때, 최소 2명의 의사를 포함시킵니다.
		
		Singer sing1 = new Singer("홍길동");
		sing1.show();
		air.enterance(sing1);
		
		Student stu = new Student("장보고");
		stu.show();
		air.enterance(stu);
		
		Doctor doc1 = new Doctor("김사부");
		doc1.show();
		air.enterance(doc1);
		
		Doctor doc2 = new Doctor("김재준");
		doc2.show();
		air.enterance(doc2);
		
		Singer sing2 = new Singer("아이유");
		sing2.show();
		air.enterance(sing2);
		
		Student stu2 = new Student("가나다");
		stu2.show();
		air.enterance(stu2);
	
		
		
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요.
		air.findDoctor();
		
		
		
	}

}
