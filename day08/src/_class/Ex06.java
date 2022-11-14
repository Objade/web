package _class;

class Human {
	// 필드
	String name;
	int age;
	
	// 생성자
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드
	void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
	
}

public class Ex06 {
	public static void main(String[] args) {
		
		String[] names = { "이지은", "홍진호", "강호동", "주호민", "이병건" }; 
		int[] ages =     {	30, 	 41,	 52,  	 42, 	 40	  };
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s : %d살\n", names[i], ages[i]);
		}
		System.out.println();
		
		
		// 클래스를 활용한 코드
		
		Human h1 = new Human("이지은", 30);		// 첫글자가 대문자로 시작하는 함수 -> 생성자
		Human h2 = new Human("홍진호", 41);
		Human h3 = new Human("강호동", 52);
		Human h4 = new Human("주호민", 42);
		Human h5 = new Human("이병건", 40);
		
		Human[] arr = { h1, h2, h3, h4, h5 };
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
		
		
		// 이름과 나이가 하나의 객체에 모여있기 때문에, 나이를 기준으로 객체를 정렬 하면
		// 이름은 자동으로 바뀌어 있음
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i].age > arr[j].age) {
					Human tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		
		
		
		// 서로 다른 자료형을 배열로 묶어서 처리한다고 가정하면...
		// 배열의 0번째는 이름이고, 배열의 1번째는 나이임
		
		Object[] a1 = { "이지은", 30 };
		Object[] a2 = { "홍진호", 41 };
		Object[] a3 = { "강호동", 52 };
		Object[] a4 = { "주호민", 42 };
		Object[] a5 = { "이병건", 40 };
		
		Object[][] arr2 = { a1, a2, a3, a4, a5 };
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("%s : %d\n", arr2[i][0], arr2[i][1]);
		}
		
		// 이렇게도 쓸 수는 있지만, 한눈에 들어오지 않음
		
		
		
		
		
	}
}
