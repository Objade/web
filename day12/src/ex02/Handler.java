package ex02;

public class Handler {
	Student[] arr = new Student[5];

	public String showList() {
		String result = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].toString() + "\n";
			}
			
		}

		return result;
	}

	public int addList(Student st) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = st;
				return 1;
			}
		}	
		return 0;
	}

	public String search(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i].name.contains(find)) {
					return arr[i].toString();
				}
			}
			
		}
		return "검색 결과가 없습니다.";
	}

	public int update(String find, int kor, int eng, int mat) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i].name.equals(find)) {
					arr[i].kor = kor;
					arr[i].eng = eng;
					arr[i].mat = mat;
					arr[i].sum = kor + eng + mat;
					arr[i].avg = arr[i].sum / 3.0;
							
					return 1;					
				}
			}
		}
		
		return 0;
	}

	public int delete(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i].name.equals(find)) {
					arr[i] = null;
					return 1;
				}
			}
			
			
		}
		return 0;
	}


	
	// 목록, 추가, 검색(이름기준, 단일 검색), 수정, 삭제
	
	
	
	
	
}
