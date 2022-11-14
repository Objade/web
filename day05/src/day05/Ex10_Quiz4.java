package day05;

public class Ex10_Quiz4{
	static String profile(long data) {
		
		String number = data + "";
		

		if(number.length() == 12) {
			number = String.format("%013d", data);
		}
		
	
		String year = number.substring(0, 2);
		int age = Integer.parseInt(year);
		char check = number.charAt(6);
		
		
		if(check == '1' || check == '2') age = 2022 - (1899 + age);
		else age = 2022 - (1999 + age);
				
		// 성별 구하기
		String gender = "";
		
		if(check == '1' || check == '3') gender = "남성";
		else if (check == '2' || check == '4') gender = "여성";

		String result = String.format("%d세, %s입니다.", age, gender);
		
		return result;
	}
	
	static String profile(String data) {
		
		String d1 = data.replace("-","");
		
		long num = Long.parseLong(d1);
		
		String result = profile(num);
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		// 주민등록번호를 전달받아서, 나이와 성별을 출력하는 함수를 작성하세요
		// 인자는 정수 혹은 문자열로 전달할 수 있습니다.
		// 결과는 String.format을 이용하여 나이, 성별을 문자열 형식으로 반환합니다.
		
		String s1 = profile(9305162345678L);	// long	-> 정수 뒤에 L을 붙이면 long 타입으로 바뀜
		String s2 = profile("930516-2345678");	// String
		
		
		String s3 = profile("021231-4123456");
		String s4 = profile("011212-3234567");
		
		
		System.out.println(s1);	 // 30세, 여성입니다.
		System.out.println(s2);  // 30세, 여성입니다.
		
		System.out.println(s3);
		System.out.println(s4);
	}
}

