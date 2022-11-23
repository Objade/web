package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		FileWriter fw = new FileWriter(f, true); 	// append : true/false
													// true -> 결과가 누적되어 저장 / false -> 이전 결과를 삭제하고 새로운 결과로 덮어씌움
		// autoFlush : 자동으로 flush가 설정되어 있음
		
		
		fw.append("Hello");
		fw.append(",");
		fw.append("world\n");
		
		fw.close();
		
		System.out.println("끝");
		
		
		
	}
}
