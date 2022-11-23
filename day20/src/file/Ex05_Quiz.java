package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex05_Quiz {
	public static void main(String[] args) throws IOException {
		// C:\\2022111\\e.txt 파일을 생성하고
		// Scanner를 이용하여 키보드로 문자열을 입력받아서 
		// 입력받은 문자열을 대상 파일에 기록하는 코드를 작성하세요
		// 단, 파일에 기록이 이루어질때마다, 현재 시간을 기록하게 하고
		// 내용이 변경되는 것이 아니라 추가되게끔 설정해 보세요.
		
		// 표준 입력 -> 프로그램 -> 파일출력
		
		
		File f = new File("C:\\20221110\\e.txt");
		
		Scanner sc = new Scanner(System.in);
		
		
		FileOutputStream fos = new FileOutputStream(f, true);	// false를 적으면 입력을 새로 받을 때 마다 덮어씀 (이전 내용이 사라짐)
		
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분 ss초");
		
		
		System.out.print("문자열 입력 : ");
		String result = sc.nextLine();
				
		
		osw.append(result + "\n");
		osw.append(sdf.format(new Date()) + "\n\n");
		
		osw.flush();
		osw.close();

		sc.close();
		System.out.println("끝");
		
//		- Stream은 통로
//		-> 입력을 받은 값은 버퍼 위에 올라감
//		-> flush를 사용해서 버퍼 위의 값들을 밀어넣어줌
		
		
		
	}
}
