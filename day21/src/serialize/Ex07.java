package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Ex07 {
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("ex01.dat");
		
		// 웹 상의 이미지 주소를 작성하여 이미지 다운로드 해보기
		
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMTdfMjk2%2FMDAxNjY1OTM0MTM2ODg4.pHDlZDhaWc3VbJ9dFps-58oSBUQPJfOijB_oM2vX9zcg.IHWAbBCU9f8Bs6w5HGRVu8IHEm-9aAF5Y5EJZOMDXSEg.JPEG.tjdduq33%2Fphoto-1532357716190-db6e6a7db9fd.jpg&type=sc960_832";
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// 연결된 자원의 컨텐트 유형을 문자열 형태로 확인할 수 있다.
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		System.out.println("컨텐트 유형은 " + contentType + "입니다.");
		System.out.print("원하는 파일 이름을 입력하세요 : "); 	// 파일이름.컨텐트 타입	(ex - 은하수.jpg)
		fileName = sc.nextLine();
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		// 파일의 크기 구하기
		
		byte[] buffer = new byte[1024];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
			
			
			}
			
		
		
		fis.close();
		fos.close();
		
		
		
		sc.close();
		
	}
	
}
		