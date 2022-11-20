package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list1 = Arrays.asList(arr);
		System.out.println("list1 : " + list1);
		
		// 복사본
		List<Integer> list2 = new ArrayList<Integer>(list1);
		System.out.println("원본을 복사한  list2 : " + list2);

		System.out.println();
		
		
		
		// 오름차순 정렬
		list1.sort((a, b) -> a - b);
		System.out.println("오름차순 정렬 후 list : " + list1);
		
		// 내림차순 정렬
		list1.sort((a, b) -> b - a);
		System.out.println("내림차순 정렬 후 list : " + list1);
		
		
		System.out.println();
		System.out.println("list2(원본 유지) : " + list2);
		
		
		System.out.println();
		
		
		
		// 문자열의 경우
		String[] arr3 = {"나비", "다람쥐", "가방", "라디오"};
		List<String> list3 = Arrays.asList(arr3);
		
		// 문자열 오름차순
		list3.sort((a, b) -> a.compareTo(b));
		System.out.println(list3);
		
		// 문자열 내림차순
		list3.sort((a, b) -> b.compareTo(a));
		System.out.println(list3);
		
		
	}
}
