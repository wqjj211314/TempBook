package org.giles.bmp.entity;

public class Book {
	private int id;
	private String bookName;
	private String author;
	private String time;
	private double price;
	private int store;
	public Book(int id, String bookName, String author, String time,
			double price, int store) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.time = time;
		this.price = price;
		this.store = store;
	}
	
	public int getId() {
		return id;
	}
	public Book() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	public String toString(){
		return id + "\t\t" + bookName + "\t\t" + author
				+ "\t\t" +time + "\t" + price + "\t" + store;
	}
	
	

}
