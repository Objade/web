package student;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler handler = new Handler();		// 생성자에서 파일을 읽어들임
		
//		handler.showList();
		
		Student st;
		int select, kor, eng, mat, row;
		String name, find;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.print("이름 : ");	name = sc.nextLine();
				System.out.print("국어 점수 : "); kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 점수 : "); eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 점수 : "); mat = Integer.parseInt(sc.nextLine());
				
				st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
				
			case 3:
				System.out.print("삭제할 학생의 이름 입력 : ");
				find = sc.nextLine();
				
				row = handler.delete(find);
				System.out.println(row == 1 ? "삭제성공" : "삭제실패");
				break;
				
			case 4:
				System.out.print("정렬 방식 선택 (1. 이름순 | 2. 성적합계순) : ");
				select = Integer.parseInt(sc.nextLine());
				
				if(select == 1) {
					handler.nameSorting();
					System.out.println("이름 오름차순 정렬 완료");
				}
				if(select == 2)	{
					handler.sumSorting();
					System.out.println("성적합계 오름차순 정렬 완료");
				}
				
				break;
				
				
				
			case 0:
				handler.save();		// 메인이 종료되기 직전에 저장함
				sc.close();
				
			}
			
			
			
			
		} while(select != 0);
		
		
		
		
		
		
		
	}
}
