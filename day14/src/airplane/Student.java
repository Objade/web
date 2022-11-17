package airplane;

public class Student extends Human {
	
	Student(String name) {
		super(name);
	}

	@Override
	void show() {
		System.out.printf("학생 ");
	}
	
	
}
