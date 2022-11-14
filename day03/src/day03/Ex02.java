package day03;

public class Ex02 {
	public static void main(String[] args) {
		
		// 대문자 A 부터 Z까지 한 줄에 출력하세요
		// 각 글자는 ,로 구분하고, 마지막에는 콤마가 없어야 합니다.
		
		// 반복하고 싶은 것 : A ~ Z까지 출력, 콤마 구분
		
		char word = 'A';
		
		for(int i = 0; i < 25; i++) {
			System.out.print(word + ", ");
			word++;
			
			if (word == 'Z'){
				System.out.print(word);
			}
		}
	
		System.out.println();
		
		
		
		// 풀이
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			
			String next = (ch == 'Z') ? "\n" : ", ";	// ch가 'Z'면 "\n"을, 아니면 ", " 을 출력
			System.out.print(next);
			
			
		}
		
		
		
		
	}
}
