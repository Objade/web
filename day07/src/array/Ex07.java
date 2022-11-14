package array;

public class Ex07 {
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
		guide(arr);
		show(arr);
		
		// 숫자 출력 (W자 형태)
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int tmp;
				if(j % 2 == 0) {
					tmp = i + 1;
				}
				else {
					tmp = 5 - i;
				}
				arr[i][j] = j * 5 + tmp;	
			}
		}
		show(arr);
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int tmp = i % 2 == 0 ? j + 1 : 5 - j;
	
				arr[j][i] = i * 5 + tmp;	
			}
		}
		show(arr);
		
		
		
	}
	
	
}
