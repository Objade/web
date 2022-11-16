package accessModifier;

class Food {
	private String name;
	private int price;

	public Food(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public Food() {}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// public 필드의 getter/setter를 자동으로 작성함
	// source - generate getters and setters
	
	
}



public class Ex03 {
	
	public static void main(String[] args) {
		
		// 클래스 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고,
		// 각 객체의 이름과 가격을 printf()를 이용하여 같은 서식으로 출력하세요
		
		Food fo1 = new Food("사과", 1000);
		Food fo2 = new Food("바나나", 3000);
		
		
		
		System.out.printf("%s : %d원\n", fo1.getName(), fo1.getPrice());
		System.out.printf("%s : %d원\n", fo2.getName(), fo2.getPrice());
		
		
		System.out.println();
		
		
		Food ob1 = new Food();	// 비어있는 객체, 값을 담을수는 있지만 아직 없음
		
		ob1.setName("치킨");		// ob1.name = "치킨";		// Setter는 값을 대입함
		ob1.setPrice(20000); 	// ob1.price = 20000;
		
//		System.out.println(ob1.name);
		System.out.println(ob1.getName());				// Getter는 값을 불러옴
//		System.out.println(ob1.price);
		System.out.println(ob1.getPrice());
														// -> 대입할 때는 Setter, 가져올 때는 Getter
		
		System.out.println();
		
		
		ob1 = new Food("치킨", 20000);	// 두개의 필드에 대해 setter를 호출한 것과 같음
		Food ob2 = new Food("떡튀순", 15000);
		
		System.out.printf("%s : %,d원\n", ob1.getName(), ob1.getPrice());
		System.out.printf("%s : %,d원\n", ob2.getName(), ob2.getPrice());
		 
		
		
	}
	
	
}
