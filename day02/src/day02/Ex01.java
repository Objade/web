package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		System.out.println(System.in);
		System.out.println(System.out);
		System.out.println(System.err);
		
		InputStream stdin = System.in;		// 0번 통로	- 표준 입력 (데이터가 들어옴) (초록색 글자)
		PrintStream stdout = System.out;	// 1번 통로	- 표준 출력 (데이터를 내보냄) (검정색 글자)
		PrintStream stderr = System.err;	// 2번 통로	- 표준 에러 (에러를 출력함)   (빨간색 글자)
		
		// System.out.println(10 / 3);		// -> 1번 통로(표준 출력 스트림)로 전달 (검정색 글자로 출력)
		// System.out.println(10 / 0);		// -> 2번 통로(표준 에러 스트림)로 전달 (빨간색 글자로 출력)
		
		System.out.print("아무 키나 입력하세요 : ");
		int data = System.in.read();		// keyCode를 정수로 입력받는다. (1바이트 값)
		System.out.println("data : " + data);	
		
		System.out.println((char)44032); 	// 자바에서 한글을 출력하기 위해선 2바이트 값인 char로 형변환 해서 사용해야함
		
		// System.in.read()는 1바이트의 표준 입력을 처리하는 함수임
		
		System.in.read();
		System.in.read();
		
		// -> 한글은 처리할 수 없으므로, 2바이트 입력을 처리할 수 있는 새로운 함수를 사용하게 된다.
		
		// 1바이트 입력을 처리하는 객체(System.in)를 재료로 사용하여, 2바이트를 처리하는 새로운 객체를 생성한다.
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.print("한글 하나 입력 : ");
		int num2 = isr.read();
		
		System.out.println(num2);
		
		// 한글자씩 입력 받으면, 문장단위 입력이 매우 까다롭기 때문에, 일정 크기로 입력 받는 형식으로 바꿈
		
		// 2바이트 입력기를 이용하여 문장단위 입력을 처리하는 객체를 생성한다.
		BufferedReader br = new BufferedReader(isr);
		br.readLine();	// 이전에 남아있던 데이터를 가져와서 버림
		
		
		System.out.print("문장을 입력하세요 : ");
		String str = br.readLine();
		System.out.println("출력 : " + str);
		
		// 자바 1.4 버전 까지는 입력을 이렇게 처리했음
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		// 1바이트를 처리하는 객체를 만듦 -> 그 객체를 바탕으로 2바이트 객체를 처리 -> 그 객체를 바탕으로 문장단위 입력을 처리
		
		
		// 자바 1.5 버전 부터는 입력을 처리하는 새로운 객체가 등장함.
		Scanner sc = new Scanner(System.in);
		
		// Scanner는 생성자 매개변수에 넣는 대상을 읽어내는 객체임
		String path = "C:\\windows\\system32\\drivers\\etc\\hosts";	// 파일의 위치
		File f = new File(path);
		Scanner sc2 = new Scanner(f);	// 스캐너를 사용해 파일의 위치를 찾고 그걸 읽어냄
		
		while(sc2.hasNextLine()) {			// 파일에 읽어내지 않은 다음 줄이 있으면
			String line = sc2.nextLine();	// 한 줄을 읽어내서 (\n 이전까지)
			System.out.println(line);		// 그 줄을 화면에 출력한다.
		}
		
		System.out.println("End");
		
		sc.close();
		sc2.close();
		
		URL url = new URL ("https://www.google.co.kr");		// 주소를 지정함
		URLConnection conn = url.openConnection();			// 연결을 생성함
		InputStream in = conn.getInputStream();				// 외부의 값을 불러옴
		Scanner sc3 = new Scanner(in);						// 불러온 값을 읽어냄
		
		while(sc3.hasNextLine()) {							// 파일에 읽어내지 않은 다음줄이 있으면
			String line2 = sc3.nextLine();					// 한 줄을 읽어내서 (\n 이전까지)
			System.out.println(line2);						// 그 줄을 화면에 출력
		}
		
		System.out.println("close");
		sc3.close();
		
	}
}
