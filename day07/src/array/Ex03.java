package array;

import java.util.Scanner;

public class Ex03 {
	// 안보고 써보기
	
	static void show(String[] arr) {
		System.out.printf("arr[%d] : { ", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? " }\n" : ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = 3;
		String[] arr = new String[length];
		String[] tmp;
		String input;
		
		while(true) {
			System.out.print("문자열 입력 : ");
			input = sc.nextLine();
			
			if(("").equals(input)) {
				break;	
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {
					arr[i] = input;
					break;
				}
			}
			
			if(arr[arr.length - 1] != null) {
				tmp = new String[length + arr.length];
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

