package animalHospital;

public class Dog extends Animal {
	
	Dog(String name, int age) {		// Dog 클래스의 생성자
		super(name, age);
		
	}

	public void tailling() {		 // Dog 클래스의 고유기능
		System.out.println(name + "가 꼬리를 흔듭니다.");
		
		
	}

	@Override
	public void bark() {
		System.out.println(name + ": 멍멍");
		
	}
	
	
	
}
