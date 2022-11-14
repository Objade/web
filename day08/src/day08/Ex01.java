package day08;

public class Ex01 {
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
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][4] = 6;
		arr[2][4] = 7;
		arr[3][4] = 8;
		arr[4][4] = 9;
		
		arr[4][3] = 10;
		arr[4][2] = 11;
		arr[4][1] = 12;
		arr[4][0] = 13;
		
		arr[3][0] = 14;
		arr[2][0] = 15;
		arr[1][0] = 16;
		
		arr[1][1] = 17;
		arr[1][2] = 18;
		arr[1][3] = 19;
		
		arr[2][3] = 20;
		arr[3][3] = 21;
		
		arr[3][2] = 22;
		arr[3][1] = 23;
		
		arr[2][1] = 24;
		
		arr[2][2] = 25;
		
		show(arr);
		
		
		//
		int num = 0;
		
		arr[0][0] = ++num;
		arr[0][1] = ++num;
		arr[0][2] = ++num;
		arr[0][3] = ++num;
		arr[0][4] = ++num;
		
		arr[1][4] = ++num;
		arr[2][4] = ++num;
		arr[3][4] = ++num;
		arr[4][4] = ++num;
		
		arr[4][3] = ++num;
		arr[4][2] = ++num;
		arr[4][1] = ++num;
		arr[4][0] = ++num;
		
		arr[3][0] = ++num;
		arr[2][0] = ++num;
		arr[1][0] = ++num;
		
		arr[1][1] = ++num;
		arr[1][2] = ++num;
		arr[1][3] = ++num;
		
		arr[2][3] = ++num;
		arr[3][3] = ++num;
		
		arr[3][2] = ++num;
		arr[3][1] = ++num;
		
		arr[2][1] = ++num;
		
		arr[2][2] = ++num;
		
	
		show(arr);
		
		
		//
		num = 0;
		
		for(int i = 0; i < 5; i++) {
			arr[0][i] = ++num;
		}
		
		for(int i = 0; i < 4; i++) {
			arr[i + 1][4] = ++num;
		}
		
		for(int i = 0; i < 4; i++) {
			arr[4][3 - i] = ++num;
		}
		
		for(int i = 0; i < 3; i++) {
			arr[3 - i][0] = ++num;
		}
		
		for(int i = 0; i < 3; i++) {
			arr[1][i + 1] = ++num;
		}
		
//		for(int i = 0; i < 3; i++) {
//			arr[i + 1][3] = ++num;
//		}
		
//		for(int i = 0; i < 3; i++) {
//			arr[3][i] = ++num;
//		}
		
		
		arr[2][1] = ++num;
		
		arr[2][2] = ++num;
		
		show(arr);
		
		
		
		//
		
		num = 0;
		int length = 5;
		arr = new int[length][length];
	
		for(int i = 0; i < length; i++) {
			arr[0][i] = ++num;
		}
		
		length--;
		
		for(int i = 0; i < length; i++) {
			arr[i + 1][4] = ++num;
		}
		
		for(int i = 0; i < length; i++) {
			arr[4][3 - i] = ++num;
		}
		
		length--;
		
		for(int i = 0; i < length; i++) {
			arr[3 - i][0] = ++num;
		}
		
		for(int i = 0; i < length; i++) {
			arr[1][i + 1] = ++num;
		}
		
		arr[2][1] = ++num;
		
		arr[2][2] = ++num;
		
		
		show(arr);
		
		
		
		
		//
		
		num = 0;
		length = 5;
		int x = -1, y = 0;
		arr = new int[length][length];
		int sign = 1;
		
		
		while(length > 0) {
			for(int i = 0; i < length; i++) {
				x += sign;
				arr[y][x] = ++num;
			}
			length--;
			for(int i = 0; i < length; i++) {
				y += sign;
				arr[y][x] = ++ num;
			}
			sign = -sign;
			
		}
		
		show(arr);
		
		
		// 결과
		
		num = 0;
		length = 5;
		x = -1;
		y = 0;
		arr = new int[length][length];
		sign = 1;
		
		while(true) {
			for(int i = 0; i < length; i++) {
				x += sign;
				arr[y][x] = ++num;
			}
			length--;
			
			if(length == 0) break;
			
			for(int i = 0; i < length; i++) {
				y += sign;
				arr[y][x] = ++ num;
			}
			sign = -sign;
			
		}
		
		show(arr);
		
		
		
		
	}
	
	
}
