package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Handler {
	
	private ArrayList<Todo> list;
	
	public Handler() {
		load();
	}
	

	
	@SuppressWarnings({ "unchecked" })
	
	public void load() {		// 생성자 내부에서 호출함. 파일에서 객체를 불러와서 리스트에 저장
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
			list = (ArrayList<Todo>) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {}
		}
		
		// 메서드를 호출하여 쓸 경우에는, 가급적이면 try ~ catch를 사용해서 예외처리를 해주는 것이 좋음
		// throw로 넘긴다면, 호출한 메서드에서도 계속 throw로 넘겨야하기 때문임
		
		
		
//		if(f.exists()) {
//			list = (ArrayList<Todo>) ois.readObject();
//			System.out.println("데이터를 불러왔습니다.");
//		}
//	
//		else {
//			System.out.println("데이터를 불러오는데 실패했습니다.");
//		}
		
	}
	
	public void save() throws IOException {		// main에서 호출함. 리스트 객체를 파일로 저장
		
//		FileWriter fw = new FileWriter(f);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ex03.dat"));
		oos.writeObject(list);
			
		oos.flush();
		oos.close();
		System.out.println("저장완료");
		
	}
	
	public int insert(Todo todo) {		// 객체를 전달 받아서 추가하기
		
		list.add(todo);
		
		return 1;
		
		
	}
	
	public int delete(String find) {		// 선택한 객체의 index를 확인하여 제거하기
		
		list.removeIf(td -> td.getTitle().equals(find));
		
		
		return 1;		
	}


	
	public void showList() {
		
		for(Todo td : list) {
			System.out.println(td);
		}
		System.out.println();
		
	}



	public void sortList() {
		list.sort((a, b) -> a.getDate().compareTo(b.getDate()));
		
	}


	


	
}
