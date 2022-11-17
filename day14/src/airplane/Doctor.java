package airplane;

public class Doctor extends Human{
	
	Doctor(String name) {
		super(name);
	}



	@Override
	void show() {
		System.out.printf("의사 ");
	}
	
	
	
	void heal(Human other) {
		System.out.println(this.name + " 의사가 " + other.name + " 치료");

	}
}
