package serialize;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
		
		Handler hd = new Handler();
		
		Scanner sc = new Scanner(System.in);
		int select, row;
		String find;
		
		Todo td = null;
		
		do {
			System.out.println("1. 추가 | 2. 목록보기 | 3. 삭제 | 4. 저장 | 0. 종료");
			System.out.print("선택 : ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 :
				td = makeTodo(sc);
				row = hd.insert(td);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 2 :
				hd.sortList();
				hd.showList();
				break;
			
			case 3 :
				System.out.print("삭제할 일정 이름 입력 : ");
				find = sc.nextLine();
				
				row = hd.delete(find);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				
				break;
				
			case 4 :
				
				hd.save();
				
				break;
			
			
			}
			
			
			
			
		} while(select != 0);
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}

	private static Todo makeTodo(Scanner sc) throws ParseException {
		
		String todo;
		String date;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		System.out.print("할 일 입력 : ");  todo = sc.nextLine();
		System.out.print("날짜 입력 (yyyy.MM.dd): ");	 date = sc.nextLine();
		
		Todo td = new Todo(todo, sdf.parse(date));
		
		return td;
	}
	
	
	
	
	
	
	
	
}
