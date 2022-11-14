package array;

public class Ex06 {
	
	static void guide(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);	
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
		
		guide(arr);	// [i][j] 의 좌표를 나타냄
		
		show(arr);
		
		// num을 사용한 경우
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++num;
			}
		}
		show(arr);
		
		
		// [i][j]의 위치를 기반으로 반복문을 돌림
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
		}
		
		show(arr);
		
		
		// 가장자리를 1로 둘러싸고, 가운데는 0으로 채우는 코드
		// 규칙 찾기 : i == 0, i == 4, j == 0, j == 4인 경우에 값이 1이 됨
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				boolean flag = i == 0 || i == 4 || j == 0 || j == 4;
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);
		
	
		// 가운데에 십자가 모양대로 1을 채우기
		// 규칙 찾기 : i == 2, j == 2인 경우에 값이 1이 됨
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				boolean flag = i == 2 || j == 2;
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);
		
		
		// 마름모 모양 만들기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				boolean flag1 = i - j == 2;
				boolean flag2 = j - i == 2;
				boolean flag3 = i + j == 2;
				boolean flag4 = i + j == 6;
				
				boolean flag = flag1 || flag2 || flag3 || flag4;
				
				arr[i][j] = flag ? 1 : 0;
				
			}
		}
		show(arr);
		
		// 숫자 출력 (S자 형태)
		
		int num1 = 11;
		int num2 = 21;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				if(i % 2 == 0) {
					arr[i][j] = i * 5 + j + 1;
				}
				else if(i == 1){
					arr[i][j] = --num1;
				}
				else if(i == 3) {
					arr[i][j] = --num2;
				}
				
				
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				if(i % 2 == 0) arr[i][j] = i * 5 + j + 1;
	
				else arr[i][j] = i * 5 + (5 - j);
			}
		}
		show(arr);
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int tmp;
				if(i % 2 == 0) {
					tmp = j + 1;
				}
				else {
					tmp = 5 - j;
				}
				arr[i][j] = i * 5 + tmp;	
			}
		}
		show(arr);
	
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int tmp = i % 2 == 0 ? j + 1 : 5 - j;
	
				arr[i][j] = i * 5 + tmp;	
			}
		}
		show(arr);
		
		
		
		
		
		
	}
}	
