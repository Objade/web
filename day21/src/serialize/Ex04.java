package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {
	
	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// ex03.dat의 객체를 list에 저장하여 아래 출력코드가 작동할 수 있도록 처리해보기
		
		ArrayList<Todo> list = null;
		
//		FileInputStream fis = new FileInputStream("ex03.dat");	
//		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
	
		
		list = (ArrayList<Todo>) ois.readObject();		// ois.readObject()는 Object로 업캐스팅 되어있는 상태이기 때문에, 
														// list에 저장하기 위해서는 ArrayList<Todo> 로 다운캐스팅 해야함
		
		for(int i = 0; i < list.size(); i++) {		// index를 활용한 for문
			Todo t = list.get(i);
			System.out.println(t);
		}
		System.out.println("\n==============================================\n");
		
		
		for(Todo t : list) {	// 향상된 for문
			System.out.println(t);
		}
		System.out.println("\n==============================================\n");			// 여기까지는 array, list 모두 사용 가능
																							// -> 반복문을 씀
		list.forEach(t -> System.out.println(t));	// 람다식과 forEach문을 활용
		System.out.println("\n==============================================\n");			// list에서만 됨   => 반복문을 쓰지 않음
		
		list.forEach(System.out::println);	// forEach문															
		System.out.println("\n==============================================\n");			// list에서만 됨   => 반복문을 쓰지 않음
																							
		// Collection은 주로 함수(메서드)를 이용해서 작업을 함
		// -> 반복문을 이용한 작업은 권장하지 않음
		
		
		ois.close();
		
	}
}
