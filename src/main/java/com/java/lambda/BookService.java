package com.java.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public <T> List<Book> getBooks(){
		List<Book> books=new BookDao().getBooks();
		for(Book book:books) {
			System.out.println(book);
		}
		Collections.sort(books,(o1, o2) -> o1.getName().compareTo(o2.getName()));

		return books;
	}
	
}


	



