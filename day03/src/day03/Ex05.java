package day03;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		
		// 진행률을 나타내는 코드를 이중 for문을 사용해서 변형함
		
		int size = 70;	
		
		for(int i = 0; i <= size; i++) {		// 0부터 size까지 1씩 증가시키면서 반복
			
			int current = i * 100 / size;		// 현재 몇 퍼센트인지 구함
			
			System.out.print("[");				// 한 줄 출력의 시작
			
			for(int j = 0; j < size; j++) {		// size만큼 반복
				
				if(j == size / 2) System.out.printf(" %3d%%", current);		// 가운데
				else if(j < i) System.out.print("#");	// 기준값 j 이전
				else System.out.print("_");				// 기준값 j 이후
			}
			System.out.println("]");			// 한 줄 출력의 끝
			
			Thread.sleep(200);					// 0.2초 딜레이
			
			if(i != size) {						// 마지막 줄이 아니면 줄바꿈으로 이전 화면 멀리 보내버리기
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			
		}
		
		
	}
}
