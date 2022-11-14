package book;

public class Bestseller {
	
	String bookName;
	String writer;
	String publisher;
	int price;
	double starPoint;
	
	Bestseller(String bookName, String writer, String publisher, int price, double starPoint){
		
		this.bookName = bookName;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.starPoint = starPoint;

		
	}
	
	String toStr() {
		String form = "%s - %s (%s), %,d원 (★%.1f)";
		form = String.format(form, bookName, writer, publisher, price, starPoint);
		return form;
	}
	

}
