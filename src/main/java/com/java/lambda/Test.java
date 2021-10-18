package com.java.lambda;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Book> books = new BookService().getBooks();
		for(Book book:books) {
			System.out.println(book);
		}
	}

}
