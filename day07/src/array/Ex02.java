package array;

import java.util.Scanner;

public class Ex02 {
	
	static void show(String[] arr) {
		System.out.printf("arr[%d] : { ", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1? " }\n" : ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		String s1 = null;	// s1이 참조하는 대상이 없다
//		String s2 = "";		// s2가 참조하는 대상의 내용이 없다.
//		
//		System.out.println(s1 == s2);
//		System.out.println(s2.equals(s1));
		
		String[] arr2 = { null, "", "Hello" };
		
		
		
		for(int i = 0; i < arr2. length; i++) {				
			System.out.println("i : " + i);
			// null. 은 성립하지 않음
			// . 왼쪽에 null이 오게 되면, NullPointerException 오류 발생
			System.out.println(arr2[i] == null);			// 대상이 null인지 확인하기
			System.out.println("".equals(arr2[i]));			// 대상의 내용이 "" 인지 확인하기
			System.out.println("Hello".equals(arr2[i]));	// 대상의 내용이 "Hello" 인지 확인하기
		}
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int length = 3;
		String[] arr = new String[length];
		String[] tmp;
		String input;
		
		while(true) {
			System.out.print("문자열 입력 : ");
			input = sc.nextLine();		// next()는 엔터키만 입력한 경우 입력으로 처리하지 않음
			
			if(("").equals(input)) {	// 입력했는데도 내용이 없으면 ""
				break;
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {	// 입력한 적이 없으면 null
					arr[i] = input;
					break;
				} 
			}
			if(arr[arr.length - 1] != null) {
				tmp = new String[arr.length + length];
				for(int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;
			}	
			show(arr);
		}
		System.out.println("끝");
		
		sc.close();
	}

}
