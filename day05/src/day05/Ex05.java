package day05;



public class Ex05 {
	
	public static void main(String[] args) {
		
		String s1 = "abc@!#$..hjk";
		
		System.out.println(s1.contains("abc"));		// 제시한 문자열이 해당 문자열에 있는가를 알려줌
		System.out.println(s1.contains(".."));
		
		if(s1.contains("hjk")) {
			s1 = s1.replace("hjk", "xyz");
		}
		
		if(s1.contains(".")) {
			s1 = s1.replace(".", "*");
		}
		
		System.out.println(s1);
		
		String s2 = "   Hello, world !!   ";
		String s3 = s2.replace(" ", "");
		System.out.println(s3);
		
		String s4 = s2.trim();		// trim() : 시작과 끝의 공백을 제거해줌
		System.out.println(s4);
		
		String s5 = "    <div>\n        Hello\n    </div>    ";
		System.out.println(s5);
		String s6 = s5.trim();
		System.out.println(s6);
		
		
		// .은 연속으로 2개 이상 배치할 수 없다.
		String s7 = "1......2";
		
//		if(s7.contains("..")) {				// s7이 ".." 을 포함하면
//			s7 = s7.replace("..", ".");		// ".." 을 "."으로 바꿈
//		}
		
		while(s7.contains("..")) {		// "." 이 연속으로 두개 오지 않을 때 까지
			s7 = s7.replace("..", ".");	// ".." 을  "."으로 바꿈
		} 
		
		System.out.println(s7);
		
		
		String s8 = "abcABC123!@#...xyz";
		// 위 문자열에서 영문자를 제외한 나머지는 모두 제거하기
		
		String s9 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s10 = "";
		
		for(int i = 0; i < s8.length(); i++) { 
			char ch = s8.charAt(i);
			if(s9.contains(ch + "")) {		// ch는 문자열이 아니므로, 빈문자열을 더해 문자열로 만들어줌
				//s10 += ch;				// s8의 내용 중 s9의 내용에 포함되는 내용이 있으면 s10에 추가해줌
				s10 = s10.concat(ch + "");	// s10 += ch와 같은 연산
			}
		}
		
		System.out.println(s10);
		
		int num = Integer.parseInt("1234");
		System.out.println(num + 1);
		
		
		
	}
}
