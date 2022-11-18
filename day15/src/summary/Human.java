package summary;

public class Human {

	String name;

	public Human(String name) {
		this.name = name;
	}

//	public void give(Cat ob) {
//		System.out.printf("%s이 %s에게 먹이를 준다.\n", this.name, ob.name);
//	}
//
//	public void give(Dog ob) {
//		System.out.printf("%s이 %s에게 먹이를 준다.\n", this.name, ob.name);
//	}
	
	
	
	// 2)
	
//	public void give(Animal ob) {
//		System.out.printf("%s이 %s에게 먹이를 준다.\n", this.name, ob.name);
//	}
	
	
	// 3)
//	public void give(Animal ob) {
//		
//		String form = "%s이 %s에게 %s 준다.\n";
//		String feed = ob.getFeed();
//		System.out.printf(form, this.name, ob.name, feed);
//		
//	}
	
	public String getName() {
		String name = this.name;
		return name;
	}
	
	// 4)
//	public void give(Companion ob) {
//		
//		String form = "%s이 %s에게 %s 준다.\n";
//		String feed = ob.getFeed();
//		System.out.printf(form, this.name, ob.getName(), feed);
//		
//		
//	}
	
	// 5)
	
	public void give(Companion ob) {
		
//		String how = ob instanceof Animal ? "던져" : "건네";
		
		String how = "";
		
		if(ob instanceof Animal) how = "던져";	// 슈퍼클래스 타입으로 묶어서 받아도,
		if(ob instanceof Human) how = "건네";		// 필요하면 구별할 수 있음
		
		String form = "%s이 %s에게 %s %s 준다.\n";
		String feed = ob.getFeed();
		System.out.printf(form, this.name, ob.getName(), feed, how);
		
		
	}
	
	
}
