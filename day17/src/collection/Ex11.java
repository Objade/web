package collection;

import java.util.ArrayList;
import java.util.List;

class Food implements Comparable<Food>{

	String brand;
	String menu;
	int price;
	
	public Food(String brand, String menu, int price) {
		
		this.brand = brand;
		this.menu = menu;
		this.price = price;
	}

	@Override
	public int compareTo(Food o) {
		
		return o.price - this.price;
	}
	
	@Override
	public String toString() {
	
		return String.format("%s - %s (%,d원)", brand, menu, price);
	}
	
}


public class Ex11 {
	public static void main(String[] args) {
		
		// 메인 함수 코드가 잘 작동하도록 클래스 및 함수를 작성하여 구현하세요.
		
		Food f1 = new Food("굽네치킨", "고추바사삭", 21000);
		Food f2 = new Food("BBQ", "황금올리브", 19000);
		Food f3 = new Food("굽네치킨", "깐풍치킨", 22000);
		Food f4 = new Food("교촌치킨", "허니콤보", 20000);
		Food f5 = new Food("KFC", "핫크리스피", 21200);
		
		List<Food> list = new ArrayList<Food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		
		System.out.println("정렬을 하지 않았을 때");
		list.forEach(food -> System.out.println(food));
		System.out.println();
		
		
		// 기본정렬하면 가격 내림차순으로 정렬하기
		System.out.println("가격 내림차순 정렬");
		list.sort(null);			
		list.forEach(food -> System.out.println(food));
		System.out.println();
		
		
		// 여기에는 직접 기준을 지정하여, 브랜드 기준 오름차순으로 정렬하기
		System.out.println("브랜드 오름차순 정렬");
		
		// 생략하지 않았을 때
		// list.sort((o1, o2) -> { return o1.brand.compareTo(o2.brand); });	
		
		list.sort((o1, o2) -> o1.brand.compareTo(o2.brand));
		list.forEach(food -> System.out.println(food));
	
	}

}
