package array;

public class Ex08_Quiz1 {
	
	static void guide(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);	// 아래의 show 함수와 이부분만 다름
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		// 숫자 출력 (달팽이집 모양)
		// 초기값을 변수 에 주고, x와 y값을 조정하며 이동시킴
		// 먼저 이동을 한 뒤에 숫자를 넣는 형식
		// 이중 for문으로 사용하는 방식은 번거롭긴 함
		// 통상적으로는 while 안에 for 문으로 많이 씀
		
		
		guide(arr);
		
		// 과정 1
		int up = 1;
		int right = 5;
		int bottom = 13;
		int left;
		
		
		
		for(int j = 0; j < arr.length; j++) {	// 5
			arr[0][j] = up++;
		}
		
		for(int i = 0; i < arr.length; i++) {	// 4
			arr[i][4] = right++;
		}
		
		for(int j = 0; j < arr.length; j++) {	// 4
			arr[4][j] = bottom--;		
		}
		
		left = 16;
		for(int i = 1; i < arr.length; i++) {	// 3
			arr[i][0] = left--;
		}
		
		up = 17;
		for(int j = 1; j < arr.length - 1; j++) {	// 3
			arr[1][j] = up++;
		}
		
		right = 19;								// 2 
		for(int i = 1; i < arr.length - 1; i++) {
			arr[i][3] = right++;
		}
		
		bottom = 23;							// 2
		for(int j = 1; j < arr.length - 1; j++) {
			arr[3][j] = bottom--;
		}
		
		up = 24;								// 2
		for(int j = 1; j < arr.length - 2; j++) {
			arr[2][j] = up++;
		}	
		
		
		show(arr);
				
		
		// 과정 2
		
			up = 1;
			for(int j = 0; j < arr.length; j++) {		// 5번
				arr[0][j] = up++;
			}
			
			right = 5;
			bottom = 13;
			for(int i = 0; i < arr.length; i++) {		// 4번
				for(int j = 0; j < arr.length; j++) {
					if(j == 4) arr[i][j] = right++;
					if(i == 4) arr[i][j] = bottom--;	
				}	
			}
			
			up = 16;
			left = 16;
			for(int i = 1; i < arr.length; i++) {		 // 3번
				for(int j = 0; j < arr.length - 2; j++) {	
					if(j == 0) arr[i][j] = left--;
					if(i == 1) arr[i][j] = up++;
				}
			}
		
			right = 19;
			bottom = 23; 
			for(int i = 1; i < arr.length - 1; i++) {	// 2번
				for(int j = 1; j < arr.length - 1; j++) {
					if(i == 3) arr[i][j] = bottom--;
					if(j == 3) arr[i][j] = right++;
				}
			}
			
			up = 24;
			for(int j = 1; j < arr.length - 2; j++) {
				arr[2][j] = up++;
			}	
		
			show(arr);
		
		
		
				
				
	}
		

}
