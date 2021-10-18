package com.java.lambda;

public class Book {
	
	private int id;
	
	private String name;
	
	private long pages;
	
	

	public Book(int id, String name, long pages) {
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}
	
	
	
	

}
