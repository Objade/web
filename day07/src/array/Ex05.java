package array;

public class Ex05 {
	public static void main(String[] args) {
		
		
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] arr3 = { 11, 12, 13, 14, 15 };
		int[] arr4 = { 16, 17, 18, 19, 20 };
		int[] arr5 = { 21, 22, 23, 24, 25 };
		
		int[][] arr = { arr1, arr2, arr3, arr4, arr5 };
		// 같은 자료형의 여러 데이터를 묶어서 저장 -> 이차원 배열이 될 수 있음
		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][3]);	// 14
		System.out.println(arr[4][4]);	// 25
		System.out.println();
		
		
		arr = new int[5][5];		// 모든 값은 0으로 초기화됨
		
		// arr[i][j]
		// arr[세로][가로]
		
		for(int i = 0; i < arr.length; i++) {			// 세로
			for(int j = 0; j < arr[i].length; j++) {	// 가로
				arr[i][j] = i * 5 + j + 1;
			}
			
		}
		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][3]);
		System.out.println(arr[4][4]);
		System.out.println();
		
		
		arr = new int[][] {
// i			j [0] [1] [2] [3] [4]
/*[0]*/			{  1,  2,  3,  4,  5 },
/*[1]*/			{  6,  7,  8,  9, 10 },
/*[2]*/			{ 11, 12, 13, 14, 15 },
/*[3]*/			{ 16, 17, 18, 19, 20 },
/*[4]*/			{ 21, 22, 23, 24, 25 }
		};
		
		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][3]);
		System.out.println(arr[4][4]);
		System.out.println();
		
		// 2차원 배열은 테이블을 만들 때 많이 사용함
		// 테이블 : 데이터를 가로 세로로 정리하여 보기 쉽게 만든 표
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] : %d\n", i, j, arr[i][j]);
			}
		}
		
		
		
	}

}
