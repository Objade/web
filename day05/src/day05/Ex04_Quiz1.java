package day05;

import java.util.Scanner;

public class Ex04_Quiz1 {
	
	
	public static void main(String[] args) {
		
		
		String id = "itbank";
		String pw = "it";
		
		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 userid, userpw를 입력받고,
		// ID/PW 모두 일치하면 [로그인 성공]
		// ID는 일치하지만 PW가 일치하지 않으면 [비밀번호 오류]
		// ID가 일치하지 않으면 [계정을 찾을 수 없습니다] 라고 출력하세요.
		
		
		System.out.print("ID 입력 : ");
		userid = sc.next();
		System.out.print("PW 입력 : ");
		userpw = sc.next();
		
		if(id.equals(userid) && pw.equals(userpw)) {
			System.out.println("로그인 성공");
		}
		
		else if(id.equals(userid)) {
			System.out.println("비밀번호 오류");
		}
		
		else if(pw.equals(userpw)) {
			System.out.println("계정을 찾을 수 없습니다.");
		}

		
		// 풀이
		
		if(id.equals(userid)) {				// ID가 일치하면
			if(pw.equals(userpw)) {			// PW도 일치하면
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 오류");
			}
		}
		else {
			System.out.println("계정을 찾을 수 없습니다.");
		}
		
		// 실제로 로그인 창을 구현할 때에는 비밀번호 오류라는 말은 빼는 것이 좋음
		// -> 비밀번호가 오류라는 말은, 아이디는 일치한다는 뜻이기 때문에 해킹의 위험이 있음
		
		
		sc.close();
	}
}
