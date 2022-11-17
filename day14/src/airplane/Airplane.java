package airplane;

import java.util.Random;

public class Airplane {
	
	private Random ran = new Random();
	
	Human[] arr = new Human[5];
	
	int enterance(Human c) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = c;
				System.out.println(c.name + " 탑승 완료");
				return 1;
			}
		}
		
		System.out.println(c.name + " 탑승 불가");
		return 0;
			
	}
	
	public int emergency() {
		
		int index;
		int cnt = 0;
		
		do {
			index = ran.nextInt(arr.length);
			
			if(cnt > 100) {
				System.out.println("탑승객이 없습니다.");
				return -1;
			}
			cnt++;
		} while(arr[index] == null);
			
		System.out.println(arr[index].name + " 고객이 급체했습니다.");
		return index;
	}
	

	public void findDoctor() {
		int pa = emergency();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Doctor && arr[i] != arr[pa]) {
				System.out.println(arr[i].name + " 의사 발견");
				int doc = i;
				((Doctor) arr[doc]).heal(arr[pa]);
				break;	
			} 
		}
		
	}
	
	
	
	
}
