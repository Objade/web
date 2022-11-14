package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class Main {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static Handler handler;
	
	
	static void prepareDummy() throws ParseException {
		
		Movie t1 = new Movie("블랙아담", "자움 콜렛 세라", 
				"드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 스윈들".split(","), 
				"액션", 125, sdf.parse("2022-10-19"), 7.63);
		
		Movie t2 = new Movie("A", "B", "C,D,E".split(","), "F", 100, sdf.parse("2000-01-01"), 10.0);
		Movie t3 = new Movie("G", "H", "I, J".split(","), "K", 100, sdf.parse("2000-05-05"), 5.6);
		
		Handler.arr[0] = t1;	// Handler가 static이기 때문에 객체 생성 없이 속성이나 기능에 접근할 수 있음
		Handler.arr[1] = t2;
		Handler.arr[2] = t3;
		
		
	}
	
	
	
	public static void main(String[] args) throws ParseException {
		
		prepareDummy();
		System.out.println(Handler.getList());
		
		Scanner sc = new Scanner(System.in);
		int row = 0, menu;
		String result;
		String find;
		
		do {
			System.out.println("1. 영화 목록 보기");
			System.out.println("2. 목록에 영화 추가");
			System.out.println("3. 영화 삭제");
			System.out.println("4. 단일 검색");
			System.out.println("5. 전체 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			
			case 1 :
				result = Handler.getList();
				System.out.println(result);
				break;
			
			case 2 : // 영화 추가
				Movie ob = input(sc);
				row = Handler.insert(ob);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
			
			case 3 :
				System.out.println("어떤 값으로 삭제합니까? (1. 영화번호 / 2. 영화 제목)");
				System.out.print("선택 : ");
				menu = Integer.parseInt(sc.nextLine());
				row = delete(sc, menu);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 4 : 
				System.out.print("검색어 입력 : ");
				find = sc.nextLine();
				result = Handler.search(find);
				System.out.println(result);
				break;
			case 5 : 
				System.out.print("검색어 입력 : ");
				find = sc.nextLine();
				result = Handler.searchList(find);
				System.out.println(result);
				break;
			}
			
			
		} while (menu != 0);
		System.out.println("====== 프로그램 종료 ======");
		sc.close();
		
		
	
		
	}
	
	
	
	static Movie input(Scanner sc) throws ParseException {
		String title;		
		String director;	
		String actors;
		String genre;		
		int runningTime;	
		String openningDate;	
		double grade;
		
		System.out.print("제목 : ");	title = sc.nextLine();
		System.out.print("감독 : ");	director = sc.nextLine();
		System.out.print("배우 : ");	actors = sc.nextLine();
		System.out.print("장르 : ");	genre = sc.nextLine();
		System.out.print("상영시간 : ");	runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("개봉일 : ");	openningDate = sc.nextLine();
		System.out.print("평점 : ");	grade = Double.parseDouble(sc.nextLine());
		
		
		Movie ob = new Movie(title, director, actors.split(","), genre, 
				runningTime, sdf.parse(openningDate), grade);
		
		return ob;
	}
	
	
	static int delete(Scanner sc, int menu) {
		int index, row = 0;
		String name;
		if(menu == 1) {
			System.out.print("삭제할 영화 번호 :");
			index = Integer.parseInt(sc.nextLine());
			row = Handler.delete(index);
		}
		else if(menu == 2) {
			System.out.print("삭제할 영화 제목 : ");
			name = sc.nextLine();
			row = Handler.delete(name);
		}
		
		else {
			System.out.println("잘못된 선택지입니다. 다시 시도 해주세요");
		}
		return row;
		
	}
	
	
}
