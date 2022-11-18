package summary;

public class Dog extends Animal implements Companion{

	

//	String name;
//
//	Dog(String name) {
//		this.name = name;
//	}
//	
	// 2)
	public Dog(String name) {
		super(name);
		
	}
	
	// 3)
	
	//	@Override
	//	public String getFeed() {
	//		return "개껌을";
	//	}
	
	// 4)
	
		@Override
		public String getFeed() {
			return "개껌을";
		}
	
	


}
