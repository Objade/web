package book;

public class Handler {
	
	Bestseller[] arr = new Bestseller[20];
	
	int insert(Bestseller ob) {		// 배열에 책 추가
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
		
	}
	
	
	String show() {		// 책 목록
		String data = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				data += arr[i].toStr();
				data += "\n";
			}
		}
		data += "\n";
		
		return data;
	
	}
	
	
	
	int delete(String name) {			// 책 삭제
		
		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] != null) {
				if(arr[i].bookName.equals(name)) {
					arr[i] = null;		
					return 1;
				}
			}
		}
		System.out.println("해당 책은 목록에 없습니다.");
		return 0;
	}

	
	

}
