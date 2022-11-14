package day11;

public class Ex01 {
	
	static void draw(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if(i == 0 || j == 0 || i == height - 1 || j == width - 1) {
					if(i == 0) {
						if(j == 0) System.out.print("┌");
						if(j == width - 1) System.out.print("┐");
						else System.out.print("──");
					}
					
					if(j == 0) {
						if(i == height - 1) System.out.print("└");
						else if (i != 0) System.out.print("│");
					}
					
					if(i == height - 1) {
						if(j != width - 1) System.out.print("──");
						else System.out.print("┘");				
					}
					
					if(j == width - 1){
						if(i != height - 1 && i != 0) {
							System.out.print("│");
						}
					}
				}
				else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int width = 4;
		int height = 5;
		
		draw(width, height);
		
		
		
	}
}
