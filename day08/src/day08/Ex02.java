package day08;

public class Ex02 {
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
		
		int num = 0;
		int length = 5;
		int x = -1;
		int y = 0;
		int arr[][] = new int[length][length];
		int sign = 1;
		
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
