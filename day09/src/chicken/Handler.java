package chicken;

// 비즈니스 로직 : 컴퓨터 프로그램에서 실세계의 규칙에 따라 데이터를 생성·표시·저장·변경하는 부분
// -> 넘겨주는 데이터를 받아서, 원하는대로 가공해주고, 그걸 메인에게 던져주는 역할을 함


// 같은 패키지 내에서는 클래스를 자유롭게 참조할 수 있음

// 파일 하나 안에는 여러개의 클래스를 만들 수 있지만, public 클래스는 단 하나만 생성할 수 있음

public class Handler {	// 데이터를 제어하고, 기능을 포함하는 클래스
	
	// 여러 데이터를 저장하기 위한 배열
	Chicken[] arr = new Chicken[10];
	
	// Chicken 타입의 객체를 전달 받아서 배열의 빈 칸에 저장하는 기능(메서드)
	int insert(Chicken ob) {
		// data 배열에서 빈칸(null)을 찾아서, 추가하고 반복 종료
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;	// 1개가 추가되었습니다.
			}	
		}
		return 0;	// 0개가 추가되었습니다 (빈칸이 없으면 추가할 수 없음)
	}
	// data 배열의 데이터 중 빈칸이 아닌 것만 화면에 출력하기
	
	void show() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].show();
			}
			
		}
	}
	
	
}






