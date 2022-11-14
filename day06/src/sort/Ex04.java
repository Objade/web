package sort;

public class Ex04 {
	public static void main(String[] args) {
		
		// 두 변수의 값을 교환하기
		
		int n1 = 10, n2 = 20;
		
		int[] num = { n1, n2 };	
		
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		n1 = num[1];
		n2 = num[0];
	
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		
		// 풀이
		
		int nn1 = 10, nn2 = 20;
		System.out.printf("n1 : %d, n2 : %d\n", nn1, nn2);
		
		int tmp = nn1;
		nn1 = nn2;
		nn2 = tmp;
	
		System.out.printf("n1 : %d, n2 : %d\n", nn1, nn2);
		
		
		
		
	}
}
