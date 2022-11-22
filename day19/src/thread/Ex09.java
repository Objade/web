package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Timer extends Object implements Runnable{
	private int second;
	private boolean over;
	
	public Timer(int second) {
		this.second = second;
		
	}
	
	public void check() {
		for(int i = second; i != -1; i--) {
			System.out.printf("\t\t\t\t[%02d:%02d]\n", i / 60, i % 60);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		over = true;
	}
	
	public boolean end() {
		return over;
	}
	
	@Override
	public void run() {
		check();
	}
}


public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		
		// 10초 동안 얼마나 많은 문자열을 입력할 수 있는지 확인하는 코드를 작성해보세요
		// 10초가 지나면 지금까지 입력받은 모든 문자열을 한줄씩 출력합니다.
		

		Timer timer = new Timer(10);
//		timer.check();	
		Thread time = new Thread(timer);
		time.start();
		
		while(timer.end() == false) {
			System.out.print("문자열 입력 : ");
			list.add(sc.nextLine());
		}
		
		
		System.out.print("입력한 문자열 : ");
		list.forEach(str -> System.out.println(str));
		
		sc.close();
	}
}
