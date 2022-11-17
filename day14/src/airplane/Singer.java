package airplane;

public class Singer extends Human{
	
	Singer(String name) {
		super(name);
		
	}

	@Override
	void show() {
		System.out.print("가수 ");
	}

}
