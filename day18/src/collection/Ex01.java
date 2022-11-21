package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		
		// Set은 크기가 있지만, index는 없음
		// 값의 중복을 허용하지 않음
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println("set의 크기 : " + set.size());	// 결과 : 3 (중복 허용 X)
//		set.get(0);		// index를 이용해서 특정 값을 불러올 수 없음
		
		System.out.println(set);
		
		// 정렬이라는 개념이 성립하지 않음
		
		
//		for(int i = 0; i < set.size(); i++) {
//			index를 이용한 반복문을 사용할 수 없다면?	
//		}
		
		// 향상된 for문을 이용해 index를 이용하지 않고 출력할 수 있음
		
		for(Integer num : set) {		// set안에 들어있는 각 원소를 Integer 타입의 num에 저장해서
			System.out.println(num);	// 각 정수를 화면에 출력함
			// 순회 (순서대로 조회)
		}
		
		// Iterator를 사용한 반복
		Iterator<Integer> it = set.iterator();		// 반복자
		while(it.hasNext()) {				// sc.hasNext();  -> 다음 요소가 있으면 꺼내서 쓰는 방식
			Integer num = it.next();		// sc.next();
			System.out.println("num : " + num);
		}
		
		// Set은 값의 중복을 허용하지 않는다
		// ex) 여러 값이 전달될 때, 변수의 이름은 중복이 되면 안됨
		// -> 이때, 의도적으로 중복을 배제하기 위해서 Set을 사용함
		
		
		
		
		
		
		
	}

}
