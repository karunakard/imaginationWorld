package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBooks(){
		List<Book> books=new ArrayList<Book>();
		books.add(new Book(1,"java",100));
		books.add(new Book(2,"spring",200));
		books.add(new Book(4, "science",400));
		books.add(new Book(3,"maths" , 500));
		books.add(new Book(5,"java",800));
		return books;
	}

}
