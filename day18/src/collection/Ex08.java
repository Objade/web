package collection;

import java.util.HashMap;
import java.util.Scanner;

// chrome을 실행하는 프로그램 만들기

class MyChromeDriver {
	
	private final String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
	private final Runtime rt = Runtime.getRuntime();
	
	public void open(String url) {
		run(url);
		
	}
	
	public void open(String url, HashMap<String, String> param) {
		url += "?";
		
		for(String key : param.keySet()) {
			String value = param.get(key);
			url += key + "=" + value + "&";
		}
		run(url);
	}
	
	private void run(String url) {
		
		try {
			rt.exec(chromePath + " " + url);	// 입력받은 url을 크롬으로 실행
//			rt.exec(chromePath);		// 크롬 실행
			
		} catch (Exception e) {}
		
		
	}
	
}


public class Ex08 {
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String query, where = "";
		
		System.out.print("검색어 입력 : ");
		query = sc.nextLine();
		
		System.out.print("어느 탭에서 검색합니까? (1. 통합 | 2. 이미지 | 3. 뉴스 | 4. 비디오) : ");
		num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:		where = "nexearch";	break;
		case 2:		where = "image"; 	break;
		case 3:		where = "news";		break;
		case 4:		where = "video";	break;
		
		}
		
		MyChromeDriver ob = new MyChromeDriver();
		
//		ob.open("www.naver.com");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("query", query);
		param.put("where", where);
		
		
		
		ob.open("search.naver.com/search.naver", param);
		
		sc.close();
	}

}
