package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class Ex06 {
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("ex01.dat");
		
		// 웹 상의 이미지 주소를 작성하여 이미지 다운로드 해보기
		
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAxMThfMjk2%2FMDAxNjQyNTE1MTg1MDA2.YLtsu24UH52R8WlGMdPjkXqcBPletaNNuyzxw2Ua5Wgg.MP6AUYe6YPt4Lz_MqiTwO4iC6VWI4PJHhZE3W5SaA6cg.JPEG.black_ssol%2F20181020%25A3%25DF142622.jpg&type=sc960_832";
		URL url = new URL(path);
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream("바다.jpg");
		
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
		
	
		
	}
}
