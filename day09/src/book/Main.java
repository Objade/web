package book;

import java.util.Scanner;

public class Main {
	
	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		int bestSeller;
		Scanner sc = new Scanner(System.in);
	
		int result = 0;
		
		do {
			System.out.println("1. 책 추가");
			System.out.println("2. 책 목록");
			System.out.println("3. 책 삭제");
			System.out.print("선택 : ");
			
			bestSeller = Integer.parseInt(sc.nextLine());
			
			switch(bestSeller) {
			
			case 1 :
				
				Bestseller ob = input(sc);
				result = handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				System.out.println();
				break;
				
			case 2 :
				
				String list = handler.show();
				System.out.println(list);
				break;
				
			case 3 :
				
				handler.show();
				System.out.print("삭제할 책 제목 : ");
				String deleteBook = sc.nextLine();
				System.out.printf("%s 을/를 목록에서 삭제합니다\n", deleteBook);
				
	
				result = handler.delete(deleteBook);
				
				System.out.println(result == 1 ? "삭제 성공" : "삭제 실패");
				System.out.println();
				break;
			
			}
				
		} while (bestSeller != 0);
		
		
		
		
		sc.close();
		
		
	} // main 끝
	
	static Bestseller input(Scanner sc) {		// 입력 
		
		String bookName, writer, publisher;
		int price;
		double starPoint;
		
		System.out.print("책 제목 : ");
		bookName = sc.nextLine();
		
		System.out.print("저자 : ");
		writer = sc.nextLine();
		
		System.out.print("출판사 : ");
		publisher = sc.nextLine();
		
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("별점 : ");
		starPoint = Double.parseDouble(sc.nextLine());
		
		Bestseller ob = new Bestseller(bookName, writer, publisher, price, starPoint);
		
		return ob;
	}
	
	
	
}
