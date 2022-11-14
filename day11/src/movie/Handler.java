package movie;

public class Handler {
	
	static Movie[] arr = new Movie[10];
	
	static String getList() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += (i + 1) + ")";
				result += arr[i].getInfo();
				result += "\n";
			}
		}
		return result;
	}
	
	static int insert(Movie ob) {		// 추가 함수
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		
		return 0;
	}
	
	static int delete(int index) { 	// 삭제는 번호 / 키워드 모두 가능
		if(arr[index - 1] != null) {
			arr[index - 1] = null;
			return 1;
		}
		return 0;
	}
	
	static int delete(String keyword) {		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.equals(keyword)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	
	static String search(String keyword) {
		String result = "검색 결과가 없습니다";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {				
				result = "해당 영화를 찾았습니다.\n";
				result += arr[i].getDetail();
				return result;
			}
	
		}
		
		return result;
	}

	
	static String searchList(String keyword) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				// i번째 칸이 빈칸이 아니고, i번째 요소의 내용에 keyword가 포함되어 있으면
				result += arr[i].getInfo() + "\n";	
				// 원하는 요소를 찾고나서 다른 요소도 추가로 검색하여 결과에 누적시킨다
			}
		}
		return result;
	}
	
}
