package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 사용자 입력 -> main의 지역변수 -> 클래스의 생성자로 전달 -> 객체의 멤버필드에 저장 -> 객체를 배열에 저장
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
	
		int kor, eng, mat;		// 메인에서의 지역 변수들 : 사용자에게 입력받기 위해 사용
		String find;
		int row;
		int select;
		String result;
		
		do {
			System.out.println("1. 목록 보기");
			System.out.println("2. 목록에 추가");
			System.out.println("3. 단일 검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1: // 목록 출력
				result = hd.showList();		
				System.out.println(result);
				break;
			
			case 2: // 목록 추가
				
				Student st = input(sc);
				row = hd.addList(st);				
				System.out.println(row == 1 ? "추가 성공 " : "추가 실패");
				System.out.println();
				
				break;
			
			case 3:	// 단일검색
				System.out.print("검색어 입력 : ");
				find = sc.nextLine();
				result = hd.search(find);
				System.out.println(result);
				break;
				
			case 4:	// 수정
				System.out.print("수정 항목 이름 입력 : ");
				find = sc.nextLine();
				
				System.out.print("국어 점수 : ");
				kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 점수 : ");
				eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 점수 : ");
				mat = Integer.parseInt(sc.nextLine());
				
				row = hd.update(find, kor, eng, mat);
				System.out.println(row == 1 ? "수정 성공" : "수정 실패");
				break;
			
			case 5: // 삭제
				System.out.print("삭제할 항목 이름 입력 : ");
				find = sc.nextLine();
				row = hd.delete(find);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
		
				break;
			
			}
			
			
			
		} while(select != 0);
		sc.close();
		System.out.println("프로그램 종료");
		
		
		
	}
	
	static Student input(Scanner sc) {
		
		String name;
		int kor = 0, eng = 0, mat = 0;

		System.out.print("이름 입력 : ");	name = sc.nextLine();
		System.out.print("국어 점수 입력 : "); kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수 입력 : "); eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수 입력 : "); mat = Integer.parseInt(sc.nextLine());
				
		Student ob = new Student(name, kor, eng, mat);
		
		
		
		return ob;
	}
	
	
}
