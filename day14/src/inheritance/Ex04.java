package inheritance;

// 클래스의 상속관계를 이용하여 공통 속성은 슈퍼클래스에, 개별 속성은 각각의 서브 클래스에 만들어 줌

class Human{		// 슈퍼 클래스
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살\n", name, age);
	}
	
}


class Student extends Human {
	int score;
	
	Student(String name, int age, int score) {
		super(name, age);	// 슈퍼클래스에게 name과 age를 넘겨줌
		this.score = score;
	}
	
	@Override
	void show() {
		System.out.printf("이름 : %s, 나이 : %d, 점수 : %d\n", name, age, score);
	}

}

class Doctor extends Human {
	String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
		
	}
	
	@Override
	void show() {
		System.out.printf("%s의사 %s, %d살\n", major, name, age);
		
	}
	
	// Doctor 클래스의 고유기능 (치료)
	// -> 오버라이딩이 아님
	void heal(Human other) {
		System.out.printf("%s가 %s를 치료합니다\n", this.name, other.name);
	}
	
	
}

// 공통 속성은 슈퍼클래스에게, 개별 속성은 서브클래스에게.

public class Ex04 {
	public static void main(String[] args) {
		
		Student st1 = new Student("이지은", 30, 99);
		Student st2 = new Student("홍진호", 41, 22);
		Doctor d1 = new Doctor("김재준", 36, "신경외과");
		Doctor d2 = new Doctor("김사부", 45, "내과");
		
		st1.show();
		st2.show();
		d1.show();
		d2.show();
		
		
		
		// 업캐스팅
		Human h1 = st1;		// 학생은 사람이다
		Human h2 = st2;
		Human h3 = d1;		// 의사는 사람이다
		Human h4 = d2;
		
		// -> 객체를 새로 생성한 것은 아니지만, Human 타입으로 참조를 할 수 있음.
		// -> Human 타입을 상속받았기 때문임
		
		System.out.println(h1.name);
		System.out.println(h2.name);
		System.out.println(h3.name);
		System.out.println(h4.name);
		
//		System.out.println(h1.score);	// score cannot be resolved or is not a field	-> human에서는 score를 참조할 수 없음
		System.out.println(((Student)h2).score);	// 강제 형변환
//		System.out.println(h3.major);
		System.out.println(((Doctor)h4).major);
		
		// 다형성에 의해 서로 다른 타입으로 참조할 수 있지만, 타입에 따라 참조가능한 필드 범위가 달라짐
		
		h1.show();		// show() 메서드는 Human 타입에 정의되어 있어서 호출이 가능함
		h2.show();		// 각 객체의 메서드는, 서브 클래스에 의해 오버라이딩(덮어씌우기) 되어있다.
		h3.show();		// 호출이 가능하지만, 호출한 후 실행되는 내용은 덮어씌운 내용으로 실행됨
		h4.show();		// 강제 형변환이 없어도 서브 클래스의 내용대로 실행됨
		
		
		// 필드를 참조할 때에는 형변환을 해야하지만, 메서드를 참조할 때에는 오버라이딩이 되었기 때문에, 따로 형변환 등의 작업을 하지 않아도 됨
			
		System.out.println();
		
//		h4.heal(h2);	// Human 타입에는 heal 함수가 없음
		
		// 다운캐스팅
		((Doctor)h4).heal(h2); 		// 오버라이딩이 아니라서 강제 형변환이 필요함
		
		System.out.println();
		
		
		// 같은 자료형의 여러 데이터를 묶어서 저장하는 구조 : 배열
		
		Human[] arr = { h1, h2, h3, h4 };
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		

		
	}

}
