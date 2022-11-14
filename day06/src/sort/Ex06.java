package sort;

public class Ex06 {
	
	static void showArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		// 배열의 각 요소를 비교하여 정렬하기 위해 먼저 출력해보기
		
		int[] arr = { 2, 7, 8, 4, 6 };
		
		showArray(arr);
		
		
		// 배열을 오름차순으로 정렬
		for (int i = 0; i < arr.length - 1; i++) {		// 0, 1, 2, 3
			for(int j = i + 1; j < arr.length; j++) {	// (i + 1) ~ 4
				System.out.printf("%d > %d : %b\n", arr[i], arr[j], arr[i] > arr[j]);
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println("\t교환!");
				}
			}
		}
		
		showArray(arr);
		
		// 두 수를 비교하기 위해, 비교 기준을 i로 정하고 비교 대상을 j로 정하여 
		// 기준과 대상의 크기에 따라 두 변수의 값을 교환하면서
		// 정렬을 수행하는 방식을 선택정렬(selection sort)이라고 함
		// (n번째 칸에 맞는 가장 작은 값을 선택하여 위치시킴)
		
		// 파이썬 튜터에 돌려보기
		
		
		
	}
}
