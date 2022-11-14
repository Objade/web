package day02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Ex03 {	
	public static void main(String[] args) throws IOException {
		
		String path = "https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/5xq2/image/0lp8RLaJ2IgctTWVl2nEa-JRCSc.jpg";
		
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			bis = new BufferedInputStream(new URL(path).openStream());
			fos = new FileOutputStream(new File("my.jpg"));
		
			byte[] buffer = new byte[1024];	
			int count, total = 0;				
											
			
			while((count = bis.read(buffer, 0, 1024)) != -1) {  // 버퍼, 1바이트씩 처리하면 함수호출이 너무 많음
																// 일정한 크기만큼 데이터를 모아서 한번에 처리.
															
				total += count;
				System.out.println(total);
				fos.write(buffer, 0, count);
			}
		
		} finally {
			bis.close();
			fos.close();
		}
		
		System.out.println("끝");
		
	}
}

