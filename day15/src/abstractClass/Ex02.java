package abstractClass;

abstract class Button {
	
	// abstract 메서드는 상속을 받아서 써야하기 때문에, private으로 지정할 수 없음
	// protected 혹은 public으로 설정해야 함
	// protected : 패키지가 달라도 상속관계에 있으면 접근 가능
	// public : 패키지나 상속여부에 상관없이 누구나 접근가능
	
	protected abstract void onclick();	// 클릭 했을 때에 어떤 내용을 실행할 지는 정해지지 않음
										// -> 서브 클래스에서 상속받아서 내용을 정할 것임
	public void click() {
		this.onclick();		// 어떻게 실행되는지만 적어놓음
	}
}

class MessageButton extends Button {

	@Override
	protected void onclick() {
		System.out.println("Hello, world!");
		
	}
}


class NotepadButton extends Button {	// 실행 시 메모장을 켬

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아옴
			String cmd = "notepad";				// 실행할 명령어 준비
			Process pro = rt.exec(cmd);			// 실행 후 프로세스를 저장해두었다가,
			Thread.sleep(2000);					// 2초 기다렸다가
			pro.destroy();						// 프로세스를 강제로 종료한다.
			
		} catch(Exception e) {}
	}
	
}


class CalcButton extends Button {

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다.
			String cmd = "calc";				// 실행할 명령어
			rt.exec(cmd);						// 명령어를 실행
			
		} catch(Exception e) {}
	}
	
}


public class Ex02 {
	public static void main(String[] args) {
//		Button btn1 = new Button();		-> 상속없이는 객체 생성 불가능
		
		MessageButton btn2 = new MessageButton();
		btn2.click();
		
		NotepadButton btn3 = new NotepadButton();
		btn3.click();
		
		Button btn4 = new CalcButton();		// 서브클래스의 객체를 슈퍼클래스로 참조함
		btn4.click();
	
		// 추상클래스가 직접 객체를 생성할 수는 없지만, 자료형으로써 참조변수를 사용하는 것은 가능함.
		
		Button btn5 = new Button() {
			private String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
			private String url = " https://search.naver.com/search.naver?query=아이유";
			
			@Override	
			protected void onclick() {
				try {
					Runtime rt = Runtime.getRuntime();
					
					cmd += url;
					rt.exec(cmd);
				}catch(Exception e) {}
				
			}
			
			// 오버라이딩이 되었기 때문에, Button 그 자체는 아님
			// 즉석에서 이름없이 만들어진 클래스
			// -> 익명 내부 클래스 
		};
		
		btn5.click();
		
		// private int a = 0; -> 지역변수에는 private을 붙일 수 없음
		
		
	}
}
