package com.neosoft;

public class HasARelation {

	public static void main(String[] args) {
	
		Author jaykumar = new Author("Jaykumar", 21, "Diu");
		Author devang = new Author("Devang", 21, "Diu");
		
		Publisher himalaya = new  Publisher("Himalaya","Noida");
		Publisher vision = new  Publisher("Vision","Mumbai");
		
		Book javabook = new Book("Java Basics",99,jaykumar,vision);
		Book phpBook = new Book("PHP Basics",100,jaykumar,himalaya);
		Book springbook = new Book("Spring Basics",99,devang,vision);
		Book jspBook = new Book("JSP Basics",100,jaykumar,vision);

//		Book[] library = {javabook,phpBook,springbook,jspBook};
		
		for(Book book : new Book[]{javabook,phpBook,springbook,jspBook}) 
			if(book.publisher == vision) System.out.println("Bookname => "+book.book_name+" Author Name : "+book.author.author_name);
		
		
		

	}

}

class Author{
	String author_name;
	int age;
	String place;
	
	public Author(String author_name, int age, String place) {
		super();
		this.author_name = author_name;
		this.age = age;
		this.place = place;
	}
	
}

class Publisher {
	String publisher_name;
	String publish_city;
	
	public Publisher(String publisher_name, String publish_city) {
		this.publisher_name = publisher_name;
		this.publish_city = publish_city;
	}
	
	
}

class Book{
	String book_name;
	double price;
	
	Author author;
	Publisher publisher;
	
	public Book(String book_name, double price, Author author, Publisher publisher) {
		this.book_name = book_name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	
}