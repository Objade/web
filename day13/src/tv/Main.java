package tv;

public class Main {
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		// TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요
		
		// main에서는 TV의 메서드만 호출합니다
		
		tv.powerBtn();
	
//		for(int i = 0; i < 10; i++) {
//			tv.channelUp();
//			tv.show();
//		}
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();

		
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();

		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
	
		
		tv.muteBtn();
	
		
		tv.muteBtn();

		
		tv.powerBtn();
	
		
	}

}
