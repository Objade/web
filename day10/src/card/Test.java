package card;


public class Test {
	
	public static void main(String[] args) {
		int width = 5;		// 카드의 너비
		int height = 5;		// 카드의 높이
				
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if(i == 0 && j == 0) {
					System.out.print("1");
				}
				if(i == height - 1 && j == 0) {
					System.out.print("1");
				}
				else if(i == 0 && j == width - 1) {
					System.out.print("1");
				}	
				else if(i == height - 1 && j == width - 1) {
					System.out.print("1");
				}
				else if(i == height / 2 && j == width / 2) {
					System.out.print("♥");
				}
				else {
					System.out.print("ㅁ");
				}
			}
			System.out.println();
		}
		
		
	}

}
