package summary;

public class Cat extends Animal implements Companion{

	
// 1)
//	String name;
//
//	Cat(String name) {
//		this.name = name;
//	}
	
	// 2)
	public Cat(String name) {
		super(name);
	}

	
	
	// 3)
	@Override
	public String getFeed() {
		return "츄르를";
	}

	
	// 4)
//	@Override
//	public String getFeed() {
//		return "츄르를";
//	}







}
