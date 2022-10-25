package ncs.test05;

public class Book {
	String title;
	String author;
	int price;
	String publisher;
	double discountRace;
	
	public Book() {
		
	}

	public Book(String title, String author, int price, String publisher, double discountRace) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRace = discountRace;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public double getdiscountRace() {
		return discountRace;
	}
	
	
	
}
