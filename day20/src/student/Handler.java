package student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {

	private List<Student> list = new ArrayList<Student>();
	private File f = new File("student.txt");
	private Scanner loader;
	private FileWriter writer;
	
 	public Handler() throws IOException {
		if(f.exists()) {	// 파일이 존재하면, 파일의 내용을 불러옴
			loader = new Scanner(f);
			int cnt = 0;
			while(loader.hasNextLine()) {
				cnt++;
				String line = loader.nextLine();
				String[] arr = line.split(",");
				String name = arr[0];
				int kor = Integer.parseInt(arr[1]);
				int eng = Integer.parseInt(arr[2]);
				int mat = Integer.parseInt(arr[3]);
				
				Student st = new Student(name, kor, eng, mat);
				list.add(st);
				
			}
			
			loader.close();
			System.out.printf("\n\t%d개 데이터 불러오기 완료\n\n", cnt);
				
		}
		
		else {
			System.out.println("불러올 데이터가 없습니다.");
		}
		
		
	}
	
	
	public void save() throws IOException {
		writer = new FileWriter(f);
		
		for(int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			writer.append(st.getFileData());
		}
		
		writer.flush();
		writer.close();
		System.out.println("저장 완료 !");
		
	}
	

	
	public void showList() {
		for(Student st : list) {
			st.show();
		}
		System.out.println();
		
	}


	public void insert(Student st) {
		list.add(st);
		
	}
	
	public int delete(String find) {
		// list에서 삭제할 때는 반복문 안에서 삭제하지 말자
		// list.remove(int index)	-> index번째의 객체를 제거한다.
		// list.remove(Object o)	-> o와 일치하는 객체를 제거한다.(equals)
		
		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).name.equals(find)) {
//				list.remove(list.get(i));
//				return 1;
//			}
//		}
		
				
		// 방법 1
//		int index = -1;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).name.equals(find)) {
//				index = i;
//			}
//		}
//		
//		if(index != -1) {
//			list.remove(index);		// 반복문에서 호출하지 않는다.
//			return 1;
//		}
		
		// list의 remove를 호출하여 객체를 삭제하면 그 즉시 size가 변화한다.
		// for문으로 접근하면, 지정된 횟수만큼 반복하기로 약속하고 시작하는데,
		// 도중에 size가 변경되면, 지정된 횟수만큼 반복을 수행할 수 없어지기 때문에
		// 예외가 발생할 수 있다.
		
		// 방법 2
		list.removeIf(st -> st.name.equals(find));
		// 조건에 맞는 객체를 찾아서 제거한다.
		
		return 1;
		

//		return 0;
	}
	
	public void nameSorting() {		// 이름 오름차순 정렬
		list.sort((o1, o2) -> o1.name.compareTo(o2.name));		// 반드시 int 타입으로 반환하기
	}
	
	
	public void sumSorting() {		// 합계점수 오름차순 정렬
		list.sort((o1, o2) -> o1.sum - o2.sum);
	}
	
	public void sortByAvg() {		// 평균점수 오름차순 정렬
		list.sort((a, b) -> a.avg - b.avg > 0 ? 1 : -1);
	}
	
	
}
