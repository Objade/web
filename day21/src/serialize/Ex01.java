package serialize;



import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>(		// 배열 - list - ArrayList 의 순서대로 문자열이 저장됨
				
					Arrays.asList(new String[] {	// asList는 static이기 때문에, 객체를 따로 생성하지 않아도 사용할 수 있음
						"이지은", "홍진호", "나단비"	
							
					})
				);
		
		
				FileOutputStream fos = new FileOutputStream("ex01.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(list);		// implement Serializable 한 객체를 byte 단위로 분해하여 저장
											// ArrayList는 Serializable이 implement 되어있기 때문에 writeObject 사용 가능
				
//				oos.write(buf);
				oos.write("빼빼로".getBytes());
				
				oos.flush();
				oos.close();
				
				
				System.out.println(list);
		
		
		
		
	}

}
