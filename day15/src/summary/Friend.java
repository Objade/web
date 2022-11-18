package summary;

public class Friend extends Human implements Companion{
	
	public Friend(String name) {
		super(name);
	}

	public String getFeed() {
		return "주먹밥을";
	}

//	@Override
//	public String getName() {
//		String name = this.name;
//		return name;
//	}


}
