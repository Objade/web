package summary;

public abstract class Animal {

	public String name;
	
	public Animal(String name) {
		this.name = name;
	}
	

//	public abstract String getFeed();
	
// 4)
	
	public String getName() {
		String name = this.name;
		return name;
	}
}
